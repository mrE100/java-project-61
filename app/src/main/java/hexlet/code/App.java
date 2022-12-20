package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;


public class App {
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
            Scanner scanner = new Scanner(System.in);
            int choiceNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Your choice: " + choiceNumber);
            switch (choiceNumber) {
                case GREET -> Cli.greeting();
                case EVEN -> new Even().play();
                case CALC -> new Calc().play();
                case GCD -> new Gcd().play();
                case PROGRESSION -> new Progression().play();
                case PRIME -> new Prime().play();
                case EXIT -> System.out.println("Bye-bye!");
                default -> throw new Exception("I don't know that choice");
            }
        } catch (NumberFormatException e) {
            System.out.println("This is not a number!");
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
    }
}
