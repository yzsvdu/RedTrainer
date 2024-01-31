package org.trainer.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class InputHandler {

    public static final int KEY_SPACE = 32;
    public static final int KEY_W = 87;
    public static final int KEY_A = 65;
    public static final int KEY_S = 83;
    public static final int KEY_D = 68;
    public static List<Integer> DSAW = Arrays.asList(KEY_D, KEY_S, KEY_A, KEY_W);

    private InputHandler () {}
    public static Object getInputHandler(Object window) throws Exception { // this is aY object
        Field wRField = window.getClass().getDeclaredField("wR");
        wRField.setAccessible(true);
        Object inputHandler;
        inputHandler = wRField.get(window);
        return inputHandler;
    }

    public static Object getKeyboardHandler(Object window) throws Exception { // this is Y7 object
        Object inputHandler = getInputHandler(window);
        Field oYField = inputHandler.getClass().getField("Oy");
        oYField.setAccessible(true);
        Object oYValue;
        oYValue = oYField.get(inputHandler);
        return oYValue;
    }

    public static long getWindowId(Object window) throws Exception {
        Field ne0Field = window.getClass().getDeclaredField("ne0");
        ne0Field.setAccessible(true);
        return (long) ne0Field.get(window);
    }

    public static void sendKeyboardSingleInput(Object window, int keyCode) throws Exception {
        Object keyboardHandler = getKeyboardHandler(window);
        long windowId = getWindowId(window);
        Method keyboardMethod = keyboardHandler.getClass().getMethod("invoke", long.class, int.class, int.class, int.class, int.class);
        keyboardMethod.invoke(keyboardHandler, windowId, keyCode, 0, 1, 0);
        keyboardMethod.invoke(keyboardHandler, windowId, keyCode, 0, 0, 0);
    }

    public static void sendKeyboardInput(Object window, int keyCode, boolean release) throws Exception {
        Object keyboardHandler = getKeyboardHandler(window);
        long windowId = getWindowId(window);
        Method keyboardMethod = keyboardHandler.getClass().getMethod("invoke", long.class, int.class, int.class, int.class, int.class);
        if(!release) keyboardMethod.invoke(keyboardHandler, windowId, keyCode, 0, 1, 0);
        else keyboardMethod.invoke(keyboardHandler, windowId, keyCode, 0, 0, 0);
    }


}
