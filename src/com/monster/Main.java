package com.monster;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Giant Troll", 100, 25);
        double totalDamage = troll.attack();

        System.out.println(troll.getName() + " tarafından verilen toplam hasar: " + totalDamage);
    }
}
