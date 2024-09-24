package org.trainer.gameinfo;

public class Pokemon {
    private final String name;
    private final int level;
    private final int currentHp;
    private final int maxHp;

    public Pokemon(String name, int level, int currentHp, int maxHp) {
        this.name = name;
        this.level = level;
        this.currentHp = currentHp;
        this.maxHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public String getDescription() {
        return "Lv. " + this.level + " " + this.name + " " + this.currentHp + " / " + this.maxHp;
    }

}
