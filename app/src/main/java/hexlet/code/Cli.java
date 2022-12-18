package hexlet.code;
import java.util.Scanner;

public final class Cli {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String getName() {
        System.out.println("May I have your name?");
        String name = getLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println(getName());
    }
    public static String getLine() {
        return SCANNER.nextLine();
    }
}
