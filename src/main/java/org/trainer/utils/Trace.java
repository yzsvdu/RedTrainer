package org.trainer.utils;

import net.bytebuddy.asm.Advice;

public class Trace {
    public static int traceCount = 0;
    @Advice.OnMethodEnter
    public static void enter(@Advice.Origin String method) {
        if(method.equals("public final void f.qh0.lpt3(java.lang.String,java.lang.String,f.LP,java.lang.Runnable,java.lang.Runnable,boolean)")) return;
        if(method.equals("public final java.lang.Object f.Ut0.Z6(int)\n")) return;
        if(method.equals("public static java.lang.String f.Ml0.la(int,java.lang.String)")) return;
        if(method.equals("public final java.lang.Object f.fQ.peek()")) return;
        System.out.println("Entering method: " + method);
        traceCount++;
    }
}