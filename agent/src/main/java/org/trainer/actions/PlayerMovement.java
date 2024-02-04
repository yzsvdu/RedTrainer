package org.trainer.actions;

import org.trainer.utils.InputHandler;

public class PlayerMovement {
    public static PlayerMovement instance;

    public int frameStep = 0;

    private final Object window;

    private int directionIndex = 0;

    public  int lastInputKey = 0;

    private PlayerMovement(Object window) {
        this.window = window;
    }

    public static PlayerMovement getInstance(Object window) {
        if (instance == null) {
            instance = new PlayerMovement(window);
        }
        return instance;
    }

    public void performCirclingAction() throws Exception {
        if(frameStep % 15 == 0) {
            InputHandler.sendKeyboardInput(this.window, InputHandler.DSAW.get(directionIndex % 4), true);
            directionIndex++;
        }
        InputHandler.sendKeyboardInput(this.window, InputHandler.DSAW.get(directionIndex % 4), false);
        this.lastInputKey = InputHandler.DSAW.get(directionIndex % 4);
        frameStep++;

    }
}
