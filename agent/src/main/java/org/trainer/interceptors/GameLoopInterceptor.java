package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerBattle;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

public class GameLoopInterceptor {

    public static boolean enabled = true;
    public static boolean isBattling = false;
    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object target) throws Exception {
        if(!enabled) return;

        // Get action agents
        PlayerBattle playerBattle = PlayerBattle.getInstance(target);
        PlayerMovement playerMovement = PlayerMovement.getInstance(target);

        // check for state changes
        isBattling = StateHandler.checkisBattling(target);

        // react to changes
        if(isBattling) {
            playerBattle.react();
        } else {
            playerMovement.performCirclingAction();
        }

    }

    @Advice.OnMethodExit
    public static void exit() {
        // This code will be executed at the end of the a00 method
    }
}