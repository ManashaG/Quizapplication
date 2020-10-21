package com.quiz;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String input;
        do {
            Game game = new Game();
            game.initGame();
            game.play();
            System.out.println("Wanna play again?(yes/no)");
            input=sc.nextLine();
        }while(input.equals("yes"));
    }
}
