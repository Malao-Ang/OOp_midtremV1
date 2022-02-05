package com.kaewmanee;
import java.util.Scanner;

public class minecraftApp {
    static Player player = new Player("Inw_za",100);
    static Zombie zombie = new Zombie("bob", player);
    static Scanner sc = new Scanner(System.in);

    public static String input(){
        return sc.next();
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
            case "q":
                System.exit(0);

            default:
                break;
        }
    }



    public static void main(String[] args) {
        player.battleWith(zombie);
        while(true) {
            player.showStatus();
            System.out.println("---------------");
            zombie.showStatus();

            if(player.getBlood()==0 && zombie.getBlood()>0){
                System.out.println("You lose !!");
                System.exit(0);
            }
            if(zombie.getBlood()==0 && player.getBlood()>0){
                System.out.println("You Win !!!");
                System.exit(0);
            }

            String command = input();
            process(command);
        }
    }
    
}
