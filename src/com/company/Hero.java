package com.company;

public class Hero {
    private int life;
    private int atack;
    private String superAtack;

    public Hero(int life, int atack, String superAtack) {
        this.life = life;
        this.atack = atack;
        this.superAtack = superAtack;
    }

    public Hero(int life, int atack) {
        this.life = life;
        this.atack = atack;
    }

    public int getLife() {
        return life;
    }

    public int getAtack() {
        return atack;

    }

    public String getSuperAtack() {
        return superAtack;
    }
}

