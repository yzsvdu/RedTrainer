package org.trainer.utils;

import org.trainer.Agent;

import java.lang.reflect.Field;

public class StateHandler {

    public StateHandler () {}

    public static Object getStateHandler(Object window) throws Exception {
        Field qh0Field = window.getClass().getDeclaredField("QH0");
        qh0Field.setAccessible(true);
        Object stateHandler;
        stateHandler = qh0Field.get(window);
        return stateHandler;
    }

    public static Object getMainGUI(Object window) throws Exception {
        Object stateHandler = getStateHandler(window);
        Object mainGUI;
        mainGUI = Agent.getChildFromParent(stateHandler, "js0");
        return mainGUI;
    }

    public static Object getBattleObject(Object window) throws Exception {
        Object stateHandler = getStateHandler(window);
        Object battleEventObject;
        battleEventObject = Agent.getChildFromParent(stateHandler, "K7");
        return battleEventObject;
    }

    public static Object getBattleGUI(Object window) throws Exception {
        Object battleEventObject = getBattleObject(window);
        Object battleEventGUI;
        battleEventGUI = Agent.getChildFromParent(battleEventObject, "LW");
        return battleEventGUI;
    }

}
