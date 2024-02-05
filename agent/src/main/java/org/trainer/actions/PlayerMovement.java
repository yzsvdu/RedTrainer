package org.trainer.actions;

import org.trainer.interceptors.GameLoopInterceptor;
import org.trainer.utils.InputHandler;

import java.util.*;

public class PlayerMovement {
    public class MovementPattern {
        public String name;
        public ArrayList<Integer> inputSequence;
        public ArrayList<Integer> sequenceTime;

    }

    private final Object window;

    public static PlayerMovement instance;

    public int frameStep = 0;

    public int directionIndex = 0;

    public  int lastInputKey = 0;

    public Map<String, MovementPattern> movementPatterns;

    public boolean initalized = false;

    private PlayerMovement(Object window) {
        this.window = window;
        movementPatterns = new HashMap<>();

        MovementPattern circle = new MovementPattern();
        circle.name = "Circle";
        circle.inputSequence = new ArrayList<>();
        circle.sequenceTime = new ArrayList<>();
        circle.inputSequence.add(InputHandler.KEY_W);
        circle.sequenceTime.add(30);
        circle.inputSequence.add(InputHandler.KEY_D);
        circle.sequenceTime.add(30);
        circle.inputSequence.add(InputHandler.KEY_S);
        circle.sequenceTime.add(30);
        circle.inputSequence.add(InputHandler.KEY_A);
        circle.sequenceTime.add(30);
        movementPatterns.put(circle.name, circle);

        MovementPattern leftRight = new MovementPattern();
        leftRight.name = "Left-Right";
        leftRight.inputSequence = new ArrayList<>();
        leftRight.sequenceTime = new ArrayList<>();
        leftRight.inputSequence.add(InputHandler.KEY_A);
        leftRight.sequenceTime.add(30);
        leftRight.inputSequence.add(InputHandler.KEY_D);
        leftRight.sequenceTime.add(30);
        movementPatterns.put(leftRight.name, leftRight);

        MovementPattern upDown = new MovementPattern();
        upDown.name = "Up-Down";
        upDown.inputSequence = new ArrayList<>();
        upDown.sequenceTime = new ArrayList<>();
        upDown.inputSequence.add(InputHandler.KEY_W);
        upDown.sequenceTime.add(30);
        upDown.inputSequence.add(InputHandler.KEY_S);
        upDown.sequenceTime.add(30);
        movementPatterns.put(upDown.name, upDown);

        MovementPattern randomPattern = generateRandomMovement();
        movementPatterns.put(randomPattern.name, randomPattern);

    }

    public static PlayerMovement getInstance(Object window) {
        if (instance == null) {
            instance = new PlayerMovement(window);
        }
        return instance;
    }

    public void performMovement(String movementKey, Double moveRadius) throws Exception {
        MovementPattern movementPattern = movementPatterns.get(movementKey);

        if (directionIndex == 0 && !initalized) {
            int firstDirection = movementPattern.inputSequence.get(0);
            if (firstDirection == InputHandler.KEY_W) {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_S);
            } else if (firstDirection == InputHandler.KEY_A) {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_D);
            } else if (firstDirection == InputHandler.KEY_S) {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_W);
            } else {
                InputHandler.sendKeyboardSingleInput(this.window, InputHandler.KEY_A);
            }
            initalized = true;
        }
        if(directionIndex == movementPattern.inputSequence.size() && movementKey.equals("Random")) {
            movementPatterns.put("Random", generateRandomMovement());
            directionIndex = 0;
            return;
        }

        if(directionIndex == movementPattern.inputSequence.size()) {
            directionIndex = 0;
            return;
        }

        int currentDirectionIndex = directionIndex % movementPattern.inputSequence.size();

        if(frameStep == moveRadius * 10) {
            InputHandler.sendKeyboardInput(this.window, movementPattern.inputSequence.get(currentDirectionIndex), true);
            directionIndex++;
            frameStep = 0;
        }

        int updatedDirectionIndex = directionIndex % movementPattern.inputSequence.size();
        InputHandler.sendKeyboardInput(this.window, movementPattern.inputSequence.get(updatedDirectionIndex), false);
        this.lastInputKey = movementPattern.inputSequence.get(updatedDirectionIndex);
        frameStep++;

    }

    public MovementPattern generateRandomMovement() {
        MovementPattern randomPattern = new MovementPattern();
        randomPattern.name = "Random";
        randomPattern.inputSequence = new ArrayList<>();

        int randomNumber = 5;

        ArrayList<Integer> directions = new ArrayList<>();
        directions.add(InputHandler.KEY_W);
        directions.add(InputHandler.KEY_A);
        directions.add(InputHandler.KEY_S);
        directions.add(InputHandler.KEY_D);

        ArrayList<Integer> randomInputSequence = new ArrayList<>();

        for(int i = 0; i < randomNumber; i++) {
            int randomIndex = new Random().nextInt(directions.size());
            int randomDirection = directions.get(randomIndex);
            randomInputSequence.add(randomDirection);
        }

        ArrayList<Integer> resetSequence = new ArrayList<>();
        for(int i = 0; i < randomInputSequence.size(); i++) {
            int direction = randomInputSequence.get(i);
            if(direction == InputHandler.KEY_W) {
                resetSequence.add(InputHandler.KEY_S);

            } else if (direction == InputHandler.KEY_A) {
                resetSequence.add(InputHandler.KEY_D);

            } else if (direction == InputHandler.KEY_S) {
                resetSequence.add(InputHandler.KEY_W);

            } else { // direction = KEY_D
                resetSequence.add(InputHandler.KEY_A);
            }
        }

        ArrayList<Integer> combinedSequence = new ArrayList<>(randomInputSequence);
        combinedSequence.addAll(resetSequence);
        Collections.shuffle(combinedSequence);
        randomPattern.inputSequence = combinedSequence;
        randomPattern.sequenceTime = new ArrayList<>();
        for(int i = 0; i < combinedSequence.size(); i++) {
            randomPattern.sequenceTime.add(30);
        }

        return randomPattern;
    }
}
