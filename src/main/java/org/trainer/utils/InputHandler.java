package org.trainer.utils;

import java.lang.reflect.Field;

public class InputHandler {
    private static InputHandler instance;
    public Object inputHandler;
    public Object keyboardHandler;
    public InputHandler(Object target) throws Exception {
        inputHandler = getInputHandler(target);
        keyboardHandler = getKeyboardHandler();
    }

    public static InputHandler getInstance(Object target) throws Exception {
        if (instance == null) {
            instance = new InputHandler(target);
        }
        return instance;
    }

    private Object getInputHandler(Object target) throws Exception {
        //get wR field of MJ0 object which is of class aY (aY is main input handler)
        Field wRField = target.getClass().getDeclaredField("wR");
        wRField.setAccessible(true);
        Object inputHandler;
        inputHandler = wRField.get(target);
        return inputHandler;
    }

    private Object getKeyboardHandler() throws Exception {
        Field oYField = inputHandler.getClass().getField("Oy");
        oYField.setAccessible(true);
        Object oYValue;
        oYValue = oYField.get(inputHandler);
        return oYValue;
    }
}
