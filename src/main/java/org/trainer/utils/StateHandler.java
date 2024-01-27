package org.trainer.utils;

import java.lang.reflect.Field;

public class StateHandler {
    private static StateHandler instance;
    public static Object stateHandler; // Field QH0 of type Oj in MJO

    public StateHandler(Object target) throws Exception{
        stateHandler = getStateHandler(target);
    }
    public static StateHandler getInstance(Object target) throws Exception {
        if (instance == null) {
            instance = new StateHandler(target);
        }
        return instance;
    }
    private Object getStateHandler(Object target) throws Exception {
        Field qh0Field = target.getClass().getDeclaredField("QH0");
        qh0Field.setAccessible(true);
        Object stateHandler;
        stateHandler = qh0Field.get(target);
        return stateHandler;
    }

    public boolean checkisBattling() throws Exception {
        Field K7Field = stateHandler.getClass().getField("K7");
        K7Field.setAccessible(true);
        Object battleEventObject;
        battleEventObject = K7Field.get(stateHandler);
        return battleEventObject != null;
    }
}
