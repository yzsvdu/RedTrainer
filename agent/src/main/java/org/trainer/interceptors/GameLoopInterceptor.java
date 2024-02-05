package org.trainer.interceptors;

import net.bytebuddy.asm.Advice;
import org.trainer.actions.PlayerBattle;
import org.trainer.actions.PlayerMovement;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

public class GameLoopInterceptor {
    public static boolean agentEnabled = false;
    public static boolean autoWalkEnabled = false;
    public static String autoWalkPattern = "Circle";
    public static Double moveRadius = 3.0;
    public static boolean autoBattleEnabled = false;
    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object window) throws Exception {
        PlayerBattle playerBattle = PlayerBattle.getInstance(window);
        PlayerMovement playerMovement = PlayerMovement.getInstance(window);

        if (agentEnabled) {
            Object battleEventObject = StateHandler.getBattleObject(window);

            if (battleEventObject != null) {
                if (autoBattleEnabled) {
                    playerBattle.battle();

                }
            }

            if (autoWalkEnabled && battleEventObject == null) {
                playerMovement.performMovement(autoWalkPattern, moveRadius);

            } else {
                playerMovement.initalized = false;
                playerMovement.directionIndex = 0;
                playerMovement.frameStep = 0;
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
                break;

            case "AutoBattleEnabled":
                autoBattleEnabled = (state == 1);
                break;
        }
   }

   public static void set(String propertyName, Object value) {
        switch (propertyName) {
            case "WalkPattern":
                autoWalkPattern = (String) value;
                break;

            case "WalkRadius":
                moveRadius = (Double) value;
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