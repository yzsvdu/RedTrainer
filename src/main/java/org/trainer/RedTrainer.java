package org.trainer;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;
import org.trainer.interceptors.Trainer;
import org.trainer.utils.WindowCallback;

import java.lang.instrument.Instrumentation;

public class RedTrainer {
    public static void premain(String agentArgs, Instrumentation inst) {
        new AgentBuilder.Default()
                .with(new AgentBuilder.InitializationStrategy.SelfInjection.Eager())

                //modifies Ic0 class to make input work even when the window is unfocused
                .type(ElementMatchers.nameStartsWith("f.Ic0"))
                .transform((builder, typeDescription, classLoader, module, classToRedefine) ->
                        builder.method(ElementMatchers.named("invoke"))
                                .intercept(Advice.to(WindowCallback.class))
                )

                //intercepts function in main game loop to inject custom code
                .type(ElementMatchers.nameStartsWith("f.MJ0"))
                .transform((builder, typeDescription, classLoader, module, classToRedefine) ->
                        builder.method(ElementMatchers.named("a00"))
                                .intercept(Advice.to(Trainer.class))

                )
                .installOn(inst);
    }
}
