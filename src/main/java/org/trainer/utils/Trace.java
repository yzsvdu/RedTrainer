package org.trainer.utils;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Method;

public class Trace {
    public static int traceCount = 0;
    @Advice.OnMethodEnter
    public static void enter(@Advice.Origin Method method) {
        System.out.println("Entering method: " + method);
        traceCount++;
    }
}