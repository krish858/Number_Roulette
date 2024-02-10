package game;

public class Player {
    String name;
    int guess;

    void setGuess(){
        guess = (int)(Math.random()*10);
        System.out.println(name + "guessed" + guess);
    }
}
