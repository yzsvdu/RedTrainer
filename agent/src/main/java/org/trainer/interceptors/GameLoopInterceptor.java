package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerBattle;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

public class GameLoopInterceptor {

    public static boolean agentEnabled = false;
    public static boolean autoWalkEnabled = false;
    public static boolean autoBattleEnabled = false;

    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object window) throws Exception {
        PlayerBattle playerBattle = PlayerBattle.getInstance(window);
        PlayerMovement playerMovement = PlayerMovement.getInstance(window);

        if (agentEnabled) {
            // check for state changes
            boolean isBattling = StateHandler.checkisBattling(window);

            // react to changes
            if (isBattling && autoBattleEnabled) {
                playerBattle.react();

            } else if (autoWalkEnabled) {
                playerMovement.performCirclingAction();

            } else {
                resetToIdle(window, playerMovement);

            }

        } else {
            resetToIdle(window, playerMovement);

        }
    }

   public static void toggle(String propertyName, int state) {
        switch (propertyName) {
            case "AgentEnabled":
                agentEnabled = (state == 1);
                break;

            case "AutoWalkEnabled":
                autoWalkEnabled = (state == 1);
                System.out.println(autoWalkEnabled);
                break;

            case "AutoBattleEnabled":
                autoBattleEnabled = (state == 1);
                System.out.println(autoBattleEnabled);
                break;

                
        }
   }

   public static void resetToIdle(Object window, PlayerMovement playerMovement) throws Exception {
       if (playerMovement.lastInputKey != -1) {
           InputHandler.sendKeyboardInput(window, playerMovement.lastInputKey, true);
           playerMovement.lastInputKey = -1;

       }
   }
}