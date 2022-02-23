package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

       Boss boss = new Boss();
       boss.setHealth(25);
       boss.setDefenceType("Дерево");
       boss.setDamage(30);
        System.out.println("Здоровье " + boss.getHealth() + "\nУрон " + boss.getDamage() + "\nЗащита " + boss.getDefenceType());

    }

}
