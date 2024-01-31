package org.trainer.actions;

import org.trainer.utils.BattleButtonTracer;
import org.trainer.utils.InputHandler;
import org.trainer.utils.StateHandler;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class PlayerBattle {
    private static PlayerBattle instance;

    private final Object window;

    private final ArrayList<String> battleEventLog = new ArrayList<>();

    private final ArrayList<String> battleButtonOptions = new ArrayList<>();

    private long lastEventTimestamp = 0;
    private boolean timerStarted = false;

    private boolean waitingforBattleOption = false;

    private boolean waitingforMoveSelection = false;

    private boolean locatedBattleOptionButton = false;

    private boolean locatedMoveSelection = false;

    private int frameStep = 0;

    private final long delayTime = 250; // ms
    private long elapsedDelayTime = 0;

    private PlayerBattle(Object window) throws Exception {
        this.window = window;
        battleButtonOptions.add("FIGHT");
        battleButtonOptions.add("BAG");
        battleButtonOptions.add("Pokémon");
        battleButtonOptions.add("RUN");
    }
    public static PlayerBattle getInstance(Object window) throws Exception {
        if (instance == null) {
            instance = new PlayerBattle(window);
        }
        return instance;
    }

    public void react() throws Exception {
        if (System.currentTimeMillis() - elapsedDelayTime < delayTime) {
            elapsedDelayTime++;
            return;
        }

        // log battle events
        String battleEvent = getBattleEvent();
        if (battleEventLog.isEmpty() || !battleEventLog.get(battleEventLog.size() - 1).equals(battleEvent)) {
            battleEventLog.add(battleEvent);
            lastEventTimestamp = System.currentTimeMillis();
            if (battleEventLog.size() >= 2) {
                timerStarted = true;
                locatedBattleOptionButton = false;
            }
        }

        // check state (find a better way to check for player turn instead of relying on time)
        if (timerStarted && (System.currentTimeMillis() - lastEventTimestamp) > 6000) {
            waitingforBattleOption = true;
            timerStarted = false;
        }

        // battle option fight
        fightWith(getAttackMoves());

        // increment frame step
        frameStep++;
        // reset elapsed delay time
        elapsedDelayTime = System.currentTimeMillis();

    }

    public String getBattleEvent() throws Exception {
        Object windowGUI = StateHandler.getWindowGUI(this.window);
        if(windowGUI != null) {
            Field BAField = windowGUI.getClass().getField("BA");
            BAField.setAccessible(true);
            Object kfObject = BAField.get(windowGUI);
            if (kfObject != null) {
                Field IF0Field = kfObject.getClass().getDeclaredField("If0");
                IF0Field.setAccessible(true);
                Object Dk0Object = IF0Field.get(kfObject);
                if (Dk0Object != null) {
                    Field Vw0Field = Dk0Object.getClass().getField("Vw0");
                    Vw0Field.setAccessible(true);
                    return (String) Vw0Field.get(Dk0Object);
                }
            }
        }
        return null;
    }


    public void fightWith(ArrayList<String> attackMoves) throws Exception {
        if(waitingforBattleOption && locatedBattleOptionButton) {
            InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_SPACE);
            waitingforBattleOption = false;
            locatedBattleOptionButton = false;
            waitingforMoveSelection = true;
        }

        if(waitingforMoveSelection && locatedMoveSelection) {
            InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_SPACE);
            waitingforMoveSelection = false;
            locatedMoveSelection = false;
        }

        if (waitingforBattleOption && !locatedBattleOptionButton) {
            String nextBattleOption = "FIGHT";
            if (BattleButtonTracer.getHoveredButtonLabel().equals(nextBattleOption)) {
                locatedBattleOptionButton = true;
            } else {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.DSAW.get(frameStep % 4));
            }
        }

        if(waitingforMoveSelection && !locatedMoveSelection) {
            if (attackMoves.contains(BattleButtonTracer.getHoveredButtonLabel())) {
                locatedMoveSelection = true;
            } else {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.DSAW.get(frameStep % 4));
            }
        }
    }

    public ArrayList<String> getAttackMoves() { // get attack moves for current mon
        ArrayList<String> attackMoves = new ArrayList<>();
        attackMoves.add("Flame Charge");
        return attackMoves;
    }
}