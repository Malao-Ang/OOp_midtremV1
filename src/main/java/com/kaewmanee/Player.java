package com.kaewmanee;

public class Player {
    private String name;
    private int blood;
    private Zombie zombie;
    public static final int attack = 10;
    public static final int height = 2;

    public Player(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Player() {
        this.name = "Player";
        this.blood = 150;
    }
    public void battleWith(Zombie zombie) {
        this.zombie = zombie;
    }

    public int recover() {
        blood += 5;
        return blood;
    }

    public int getBlood() {
        return blood;
    }

    public String getName() {
        return name;
    }
    public int hited(){
        blood -= zombie.getAttack();
        return blood;
    }


    public void showStatus() {
        System.out.println("name : " + name);
        System.out.println("power attack : " + attack);
        System.out.println("blood : " + blood);
    }

    public int getAttack() {
        return attack;
    }

}