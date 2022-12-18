package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Game;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


public class App {
    private Game game;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        try {
            int choiceNumber = Integer.valueOf(Cli.getLine());
            System.out.println("Your choice: " + choiceNumber);
            switch (choiceNumber) {
                case GREET:
                    Cli.greeting();
                    break;
                case EVEN:
                    new Even().play();
                    break;
                case CALC:
                    new Calc().play();
                    break;
                case GCD:
                    new Gcd().play();
                    break;
                case PROGRESSION:
                    new Progression().play();
                    break;
                case PRIME:
                    new Prime().play();
                    break;
                case EXIT:
                    System.out.println("Bye-bye!");
                    break;
                default:
                    throw new Exception("I don't know that choice");
            }
        } catch (NumberFormatException e) {
            System.out.println("This is not a number!");
        } catch (Exception x) {
            System.out.println(x);
        }
    }
}
