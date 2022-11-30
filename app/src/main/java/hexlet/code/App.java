package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Game;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


public class App {
    private static Game game;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        int choiceNumber = Cli.getNumber();
        System.out.println("Your choice: " + choiceNumber);
        switch (choiceNumber) {
            case (1):
                System.out.println("Welcome to the Brain Games!");
                Cli.getName();
                break;
            case (2):
                game = new Even();
                break;
            case(3):
                game = new Calc();
                break;
            case(4):
                game = new Gcd();
                break;
            case(5):
                game = new Progression();
                break;
            case(6):
                game = new Prime();
                break;
            default:
                System.out.println("I don't know that choice.");
        }
        if (game != null) {
            game.play();
        }
    }

}
