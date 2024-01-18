package com.monster;

public class Troll extends Monster{

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double bleed() {
        if (Math.random() < 0.25) {
            return getDamage() * 0.25;
        }
        return 0;
    }


    @Override
    public double poison() {
        if (Math.random() < 0.3) {
            return getDamage() * 0.3;
        }
        return 0;
    }
}
