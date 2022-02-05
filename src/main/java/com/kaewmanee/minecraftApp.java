package com.kaewmanee;

public class minecraftApp {
    public static void main(String[] args) {
        Player player1 = new Player("Inw_za",100);
        player1.showSatus();
        
        System.out.println();
        player1.recover();

        System.out.println();

        player1.showSatus();
    }
    
    
}
