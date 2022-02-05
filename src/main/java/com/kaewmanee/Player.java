package com.kaewmanee;

public class Player {
    private String name;
    private String skin;
    private int blood;
    private int attack;
    public static final int health =2;
    public Player(String name, String skin, int blood, int attack){
        this.name = name;
        this.skin = skin;
        this.blood = blood;
        this.attack = attack;
    }
    public Player(){
        this.name = "Player";
        this.skin = "steve";
        this.attack = 10;
        this.blood = 150;
    }
    
}
