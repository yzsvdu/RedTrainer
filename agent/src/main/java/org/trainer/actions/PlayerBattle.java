package org.trainer.actions;

import org.trainer.Agent;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayerBattle {
    private static PlayerBattle instance;
    private final Object window;

    private final ArrayList<String> battleEventLog = new ArrayList<>();

    private final ArrayList<String> battleButtonOptions = new ArrayList<>();

    private long lastEventTimestamp = 0;
    private boolean timerStarted = false;

    private int frameStep = 0;

    private final long delayTime = 250; // ms
    private long elapsedDelayTime = 0;

    private PlayerBattle(Object window) throws Exception {
        this.window = window;
    }

    public static PlayerBattle getInstance(Object window) throws Exception {
        if (instance == null) {
            instance = new PlayerBattle(window);
        }
        return instance;
    }

    public void battle() throws Exception {
        if (System.currentTimeMillis() - elapsedDelayTime < delayTime) {
            elapsedDelayTime++;
            return;
        }

        Object battleGUI = StateHandler.getBattleGUI(this.window);
        Object[] currentButtons = (Object[]) Agent.getChildFromParent(battleGUI, "Y2");

        if (currentButtons.length > 4) {
            String option = "FIGHT";
            for (int buttonIndex = 0; buttonIndex < currentButtons.length; buttonIndex++) {
                String label = (String) Agent.getChildFromParent(currentButtons[buttonIndex], "GE0");
                if (label.equals(option)) {
                    selectButton(battleGUI, currentButtons, buttonIndex);
                }
            }
        } else {
            Object[] attackMoves = (Object[]) Agent.getChildFromParent(battleGUI, "rX");
            int bestIndex = -1;
            short mostDmg = 0;

            for(int i = 0; i < attackMoves.length; i++) {
                Object attackMove = attackMoves[i];
                Byte selfDamage = (Byte) Agent.getChildFromParent(attackMove, "Pv0");
                int ppLeft = extractNumber((String) Agent.getChildFromParent(currentButtons[i], "cOM9"));
                short dmg = (short) Agent.getChildFromParent(attackMove, "Di0");

                if (ppLeft == 0 || selfDamage < 0) continue;
                if (dmg > mostDmg) {
                    mostDmg = dmg;
                    bestIndex = i;
                }
            }

            if (bestIndex != -1) {
                selectButton(battleGUI, currentButtons, bestIndex);

            }
        }

        frameStep++;
        elapsedDelayTime = System.currentTimeMillis();

    }

    public void selectButton(Object parent, Object[] buttonArray, int buttonIndex) throws Exception {
        Class<?> va0Class = Class.forName("f.VA0");
        Class<?> jg0Class = Class.forName("f.JG0");
        Method c90Method = va0Class.getMethod("c90", jg0Class);
        Agent.setChildFromParent(parent, "UK", buttonIndex);
        c90Method.invoke(null, buttonArray[buttonIndex]);
        InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_SPACE);

    }

    public static int extractNumber(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        } else {
            return -1;
        }

    }
}