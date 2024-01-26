package org.trainer.actions;

import org.trainer.utils.InputHandler;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PlayerMovement {

    public static int stepCount = 0;
    public static int keyIndex = 0;

    public static void performCirclingAction(Object target) throws Exception {
        InputHandler inputHandler = InputHandler.getInstance(target);
        Method invokeMethod = inputHandler.keyboardHandler.getClass().getMethod("invoke", long.class, int.class, int.class, int.class, int.class);
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
            invokeMethod.invoke(inputHandler.keyboardHandler, window, keyCodes.get(keyIndex), 0, 0, 0);

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

        invokeMethod.invoke(inputHandler.keyboardHandler, window, keycode, scancode, 1, modifier);
        stepCount++;
    }
}
