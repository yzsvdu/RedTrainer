package org.trainer.utils;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Field;

public class BattleButtonTracer {
    public static Object currentlyHoveredButton;

    private BattleButtonTracer() {}
    @Advice.OnMethodEnter
    public static void enter(@Advice.This Object battleButton) throws Exception {
        currentlyHoveredButton = battleButton;
    }

    public static String getHoveredButtonLabel() throws Exception {
        if(currentlyHoveredButton != null) {
            Field buttonLabel = currentlyHoveredButton.getClass().getField("GE0");
            buttonLabel.setAccessible(true);
            return (String) buttonLabel.get(currentlyHoveredButton);
        }

        // hoveredButton is null when we first load into the battle scene
        return "";
    }

}
