package com.kaewmanee;
import java.util.Scanner;

public class minecraftApp {
    static Player player = new Player("Inw_za",100);
    static Zombie zombie = new Zombie("bob", player);
    static Scanner sc = new Scanner(System.in);

    public static String input(){
        return sc.next();
    }
    public static void command(){
        System.out.println("----Command----");
        System.out.println("  az : attack zombie");
        System.out.println("  ap : attack player");
        System.out.println("  hp : recover player");
        System.out.println("  q  : Quit game");
        System.out.println("  ps : player call sword (attack +10)");
        System.out.println("  zs : zombie call sword (attack +5)");
        System.out.println("----------------");
        System.out.println();
    }
    // a = attack
    // z = zombie
    // p = player
    // hp = recover player
    // q = ออกจากเกม
    public static void process(String command){
        switch (command) {
            
            case "az":
                zombie.hited();
                break;
            case "hp":
                player.recover();
                break;
            case "ap":
                player.hited();
                break;
            case "ps":
                player.callSword();
                break;
            case "zs":
                zombie.callSword();
                break;
            case "q":
                System.exit(0);
            case "command":
                command();
            default:
                break;
        }
    }



    public static void main(String[] args) {
        player.battleWith(zombie);
        command();

        while(true) {
            player.showStatus();
            System.out.println("---------------");
            zombie.showStatus();
            System.out.println();

            if(player.getBlood()<=0){
                System.out.println("Zombie Win !!!!!");
                System.exit(0);
            }
            if(zombie.getBlood()<=0){
                System.out.println("Player Win !!!!!");
                System.exit(0);
            }

            String command = input();
            process(command);
        }
    }
    
}
