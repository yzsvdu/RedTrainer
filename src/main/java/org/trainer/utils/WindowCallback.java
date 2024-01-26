package org.trainer.utils;

import net.bytebuddy.asm.Advice;

public class WindowCallback {
    @Advice.OnMethodEnter
    public static void enter(@Advice.Argument(value = 1, readOnly = false) boolean processWhileUnfocused) {
        processWhileUnfocused = true;
    }
}