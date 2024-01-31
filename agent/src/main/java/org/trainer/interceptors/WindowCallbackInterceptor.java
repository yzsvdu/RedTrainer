package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;

public class WindowCallbackInterceptor {
    @Advice.OnMethodEnter
    public static void enter(@Advice.Argument(value = 1, readOnly = false) boolean processWhileUnfocused) {
        processWhileUnfocused = true;
    }
}