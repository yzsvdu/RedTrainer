package org.trainer.utils;

import org.trainer.Agent;

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
    public static Object getInputHandler(Object window) throws Exception {
        Object inputHandler;
        inputHandler = Agent.getChildFromParent(window, "wR");
        return inputHandler;
    }

    public static Object getKeyboardHandler(Object window) throws Exception {
        Object inputHandler = getInputHandler(window);
        Object keyboardHandler;
        keyboardHandler = Agent.getChildFromParent(inputHandler, "Oy");
        return keyboardHandler;
    }

    public static long getWindowId(Object window) throws Exception {
        return (long) Agent.getChildFromParent(window, "ne0");
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
