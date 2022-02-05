package com.kaewmanee;
import java.util.Scanner;

public class minecraftApp {
    static Player player = new Player("Inw_za",100);
    static Zombie zombie = new Zombie("bob", player);
    static Scanner sc = new Scanner(System.in);

    public static String input(){
        return sc.next();
    }

    
    
}
