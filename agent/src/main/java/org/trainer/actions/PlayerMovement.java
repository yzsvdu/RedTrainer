package org.trainer.actions;

import org.trainer.utils.InputHandler;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PlayerMovement {
    public static PlayerMovement instance;

    public int frameStep = 0;

    private final Object window;

    private int directionIndex = 0;

    public  int lastInputKey = 0;

    private PlayerMovement(Object window) throws Exception {
        this.window = window;
    }

    public static PlayerMovement getInstance(Object window) throws Exception {
        if (instance == null) {
            instance = new PlayerMovement(window);
        }
        return instance;
    }

    public void performCirclingAction() throws Exception {
        if(frameStep % 30 == 0) {
            InputHandler.sendKeyboardInput(this.window, InputHandler.DSAW.get(directionIndex % 4), true);
            directionIndex++;
        }
        InputHandler.sendKeyboardInput(this.window, InputHandler.DSAW.get(directionIndex % 4), false);
        this.lastInputKey = InputHandler.DSAW.get(directionIndex % 4);
        frameStep++;
    }
}
