package org.trainer.utils;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Trace {
    @Advice.OnMethodEnter
    public static void enter(@Advice.Origin Method method) {
        System.out.println("method called: " + method);

    }
}
