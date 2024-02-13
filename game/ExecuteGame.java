package game;

import java.util.Scanner;

public class ExecuteGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player one is: ");
        String a = sc.nextLine();
        System.out.print("Player two is: ");
        String b = sc.nextLine();
        System.out.print("Player three is: ");
        String c = sc.nextLine();
        System.out.print("Player four is: ");
        String d = sc.nextLine();
        Game game = new Game(a,b,c,d);
        game.StartGame();
    }
}
