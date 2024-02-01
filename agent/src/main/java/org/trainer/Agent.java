package org.trainer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import org.trainer.interceptors.GameLoopInterceptor;
import org.trainer.interceptors.WindowCallbackInterceptor;
import org.trainer.payloads.*;
import org.trainer.utils.BattleButtonTracer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.instrument.Instrumentation;
import java.net.ServerSocket;
import java.net.Socket;

public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        new AgentBuilder.Default()
                .with(new AgentBuilder.InitializationStrategy.SelfInjection.Eager())

                //modifies Ic0 class to make input work even when the window is unfocused
                .type(ElementMatchers.nameStartsWith("f.Ic0"))
                .transform((builder, typeDescription, classLoader, javaModule, protectionDomain) ->
                        builder.method(ElementMatchers.named("invoke"))
                                .intercept(Advice.to(WindowCallbackInterceptor.class))
                )

                //intercepts function in main game loop to inject custom code
                .type(ElementMatchers.nameStartsWith("f.MJ0"))
                .transform((builder, typeDescription, classLoader, javaModule, protectionDomain) ->
                        builder.method(ElementMatchers.named("a00"))
                                .intercept(Advice.to(GameLoopInterceptor.class))

                )
                .type(ElementMatchers.nameStartsWith("f.mc"))
                .transform(((builder, typeDescription, classLoader, javaModule, protectionDomain) ->
                        builder.method(ElementMatchers.nameStartsWith("i2"))
                                .intercept(Advice.to(BattleButtonTracer.class))))

                .installOn(inst);

        Thread agentServerThread = new Thread(() -> startAgentServer());
        agentServerThread.setDaemon(true);
        agentServerThread.start();

    }

    private static void startAgentServer() {
        try (ServerSocket serverSocket = new ServerSocket(12343)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> handleClientSocket(clientSocket)).start();

            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void handleClientSocket(Socket clientSocket) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Payload.class, new PayloadDeserializer())
                    .create();

            String receivedJson;
            while ((receivedJson = reader.readLine()) != null) {
                Payload receivedPayload = gson.fromJson(receivedJson, Payload.class);

                // confirm that we received a payload from client
                ResponsePayload responsePayload = new ResponsePayload();
                responsePayload.setMessage("Agent received: Payload of type " + receivedPayload.getType());
                responsePayload.setTimestampMillis(System.currentTimeMillis());
                String responseJson = new Gson().toJson(responsePayload);
                writer.println(responseJson);

                if ("TOGGLE-PROPERTY".equals(receivedPayload.getType())) {
                    TogglePropertyPayload togglePayload = (TogglePropertyPayload) receivedPayload;
                    GameLoopInterceptor.toggle(togglePayload.getPropertyName(), togglePayload.getPropertyStatus());

                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}
