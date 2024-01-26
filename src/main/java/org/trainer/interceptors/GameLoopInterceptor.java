package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
public class GameLoopInterceptor {

    public static boolean enabled = true;
    public static boolean circling = true;

    public static InputHandler inputHandler;
    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object target) throws Exception {
        if(!enabled) return;
        inputHandler = InputHandler.getInstance(target);

        if(circling) PlayerMovement.performCirclingAction(target);
    }

    @Advice.OnMethodExit
    public static void exit() {
        // This code will be executed at the end of the a00 method
    }
}