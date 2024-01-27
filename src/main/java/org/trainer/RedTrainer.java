package org.trainer;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import org.trainer.interceptors.GameLoopInterceptor;
import org.trainer.interceptors.WindowCallbackInterceptor;
import org.trainer.utils.Trace;

import java.lang.instrument.Instrumentation;

public class RedTrainer {
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

                .installOn(inst);
    }
}

//java -javaagent:RedTrainer-1.0-jar-with-dependencies.jar -jar  -Xms128M -Xmx384M -Dfile.encoding=UTF-8 -Djava.library.path=natives/  -XstartOnFirstThread PokeMMO.jar
// java -jar  -Xms128M -Xmx384M -Dfile.encoding=UTF-8 -Djava.library.path=natives/  -XstartOnFirstThread PokeMMO.jar
