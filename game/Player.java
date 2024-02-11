package game;

import java.util.Scanner;

public class Player {
    Scanner g = new Scanner(System.in);
    String name;
    int guess;

    Player(String name){
        this.name = name;
    }

    void startguess(){
        System.out.print("choose a number: ");
        guess = g.nextInt();
        System.out.println(name + " guessed " + guess);
    }
}
