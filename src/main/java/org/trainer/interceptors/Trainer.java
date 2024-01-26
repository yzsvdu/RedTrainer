package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Trainer {
    public static boolean enabled = true;
    public static boolean circling = true;
    public static int stepCount = 0;
    public static int keyIndex = 0;

    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object target) throws Exception {
        if(!enabled) return;

        if(circling) {
            // This code will be executed at the beginning of the a00 method
            Field wRField = target.getClass().getDeclaredField("wR");
            wRField.setAccessible(true);
            Object wRValue = wRField.get(target);

            if (wRValue != null) {
                Field oYField = wRValue.getClass().getField("Oy");
                oYField.setAccessible(true);
                Object oYValue = oYField.get(wRValue);

                if (oYValue != null) {
                    Method invokeMethod;
                    invokeMethod = oYValue.getClass().getMethod("invoke", long.class, int.class, int.class, int.class, int.class);
                    Field ne0Field = target.getClass().getDeclaredField("ne0");
                    ne0Field.setAccessible(true);
                    Object ne0Value = ne0Field.get(target);

                    List<Integer> keyCodes = new ArrayList<>();
                    keyCodes.add(87); // W
                    keyCodes.add(65); // A
                    keyCodes.add(83); // S
                    keyCodes.add(68); // D

                    long window = (long) ne0Value;

                    if(stepCount % 60 == 0) {
                        invokeMethod.invoke(oYValue, window, keyCodes.get(keyIndex), 0, 0, 0);

                        if(keyIndex + 1 > 3) {
                            keyIndex = 0;
                        } else {
                            keyIndex++;
                        }
                    }
                    int keycode = keyCodes.get(keyIndex);
                    int scancode = 0;
                    int action = 1;
                    int modifier = 0;

                    invokeMethod.invoke(oYValue, window, keycode, scancode, 1, modifier);
                    stepCount++;
                }
            }
        }
    }

    @Advice.OnMethodExit
    public static void exit() {
        // This code will be executed at the end of the a00 method
    }
}