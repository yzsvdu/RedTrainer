package org.trainer.utils;

import java.lang.reflect.Field;

public class StateHandler {

    public StateHandler () {}

    public static Object getStateHandler(Object target) throws Exception { // this is Oj object
        Field qh0Field = target.getClass().getDeclaredField("QH0");
        qh0Field.setAccessible(true);
        Object stateHandler;
        stateHandler = qh0Field.get(target);
        return stateHandler;
    }

    public static boolean checkisBattling(Object target) throws Exception { // this is vH object
        Object stateHandler = getStateHandler(target);
        Field K7Field = stateHandler.getClass().getField("K7");
        K7Field.setAccessible(true);
        Object battleEventObject;
        battleEventObject = K7Field.get(stateHandler);
        return battleEventObject != null;
    }

    public static Object getWindowGUI(Object target) throws Exception { // this is js object
        Object stateHandler = getStateHandler(target);
        Field js0Field = stateHandler.getClass().getField("js0");
        js0Field.setAccessible(true);
        Object windowGUI;
        windowGUI = js0Field.get(stateHandler);
        return windowGUI;
    }

}
