package game;

public class Player {
    String name;
    int guess;

    Player(String name){
        this.name = name;
    }

    void startguess(){
        guess = (int)(Math.random()*10);
        System.out.println(name + " guessed " + guess);
    }
}
