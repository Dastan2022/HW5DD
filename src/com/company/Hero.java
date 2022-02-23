package com.company;

public class Hero {

    private int health;
    public int damage;
    public final int SET = 90;
    private String superpower;

    public Hero() {
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage (int damage){
        this.damage = damage;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public void qwdqwe() {

    }

    public void qwdqwe(int g) {

    }

    public void qwdqwe(int g, String V) {

    }

}
