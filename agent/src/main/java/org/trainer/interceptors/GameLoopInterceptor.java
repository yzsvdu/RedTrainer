package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerBattle;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

public class GameLoopInterceptor {

    public static boolean agentEnabled = false;
    public static boolean isBattling = false;
    public static boolean isWalking = false;
    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object window) throws Exception {

        PlayerBattle playerBattle = PlayerBattle.getInstance(window);
        PlayerMovement playerMovement = PlayerMovement.getInstance(window);

        if (agentEnabled) {
            // check for state changes
            isBattling = StateHandler.checkisBattling(window);

            // react to changes
            if (isBattling) {
                playerBattle.react();
            } else if (isWalking) {
                playerMovement.performCirclingAction();
            }
        } else {
            // reset player movement to make player idle
            if (playerMovement.lastInputKey != -1) {
                InputHandler.sendKeyboardInput(window, playerMovement.lastInputKey, true);
                playerMovement.lastInputKey = -1;
            }
        }
    }

   public static void toggle(String propertyName, int state) {
        switch (propertyName) {
            case "AgentEnabled":
                agentEnabled = (state == 1);
            case "AutoWalk":
                isWalking = (state == 1);
        }
   }
}