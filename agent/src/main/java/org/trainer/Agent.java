package org.trainer;

import com.google.gson.Gson;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import org.trainer.interceptors.GameLoopInterceptor;
import org.trainer.interceptors.WindowCallbackInterceptor;
import org.trainer.payloads.Payload;
import org.trainer.payloads.TogglePayload;
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

        new Thread(() -> startSocketServer()).start();
    }

    private static void startSocketServer() {
        System.out.println("Starting socket server");

        try (ServerSocket serverSocket = new ServerSocket(12343)) {
            System.out.println("Server listening on port " + 12343);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to client: " + clientSocket.getInetAddress());

                // Handle the client socket in a separate thread
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
            String jsonStringReceived;
            while ((jsonStringReceived = reader.readLine()) != null) {
                TogglePayload receivedPayload = new Gson().fromJson(jsonStringReceived, TogglePayload.class);

                System.out.println("Received from client: " + receivedPayload.getMessage());
                if(receivedPayload.getType().equals("TOGGLE")) {
                    GameLoopInterceptor.toggle(receivedPayload.getPropertyName(), receivedPayload.getState());
                }
                Payload payloadToSend = new Payload();
                payloadToSend.setMessage("Agent received: Payload of type " + receivedPayload.getType());
                String jsonPayload = new Gson().toJson(payloadToSend);

                // Send JSON string to the client
                writer.println(jsonPayload);
            }

            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
