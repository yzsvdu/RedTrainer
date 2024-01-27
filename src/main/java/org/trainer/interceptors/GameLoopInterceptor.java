package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

public class GameLoopInterceptor {

    public static boolean enabled = true;
    public static boolean isBattling = false;
    public static InputHandler inputHandler;
    public static StateHandler stateHandler;

    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object target) throws Exception {
        if(!enabled) return;

        // retrieve helper utilities
        inputHandler = InputHandler.getInstance(target);
        stateHandler = StateHandler.getInstance(target);

        // check for state changes
        isBattling = stateHandler.checkisBattling();

        // react to changes
        System.out.println("In battle: " + isBattling);
    }

    @Advice.OnMethodExit
    public static void exit() {
        // This code will be executed at the end of the a00 method
    }
}