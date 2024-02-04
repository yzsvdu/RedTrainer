package org.trainer.objectmodels;

public class AttackMove {
    private String name;
    private String category;
    private String type;
    private int remaining;
    private int damage;

    public AttackMove(String name, String category, String type, int remaining, int damage) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.remaining = remaining;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public int getRemaining() {
        return remaining;
    }

    public int getDamage() {
        return damage;
    }
}
