package com.kaewmanee;

public class Zombie {
    private String name;
    private int blood;
    private Player player;
    private int attack = 5;
    public static final int height = 2;

    public Zombie(String name, Player player) {
        this.name = "Zombie" + name;
        this.blood = 100;
        this.player = player;
    }

    public int getBlood() {
        return blood;
    }

    public Player getPlayer() {
        return player;
    }

    public int getAttack() {
        return attack;
    }


    public void showStatus() {
        System.out.println("zombie : " + name);
        System.out.println("power attack : " + attack);
        System.out.println("blood : " + blood);
    }

    public int hited() {
        blood -= player.getAttack();
        return blood;
    }
    public int callSword(){
        if(attack >=10){
            return getAttack();
        }
        else{
            attack += 5;
            return getAttack();
        }
        
    }
    public int getArmor() {
        if(getBlood() <=100){
            blood +=100;
            return getBlood();
        }
        else{
            return getBlood();
        }

    }

}