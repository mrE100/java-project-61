package hexlet.code;
import java.util.Scanner;

public final class Cli {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getName() {
        System.out.println("May I have your name?");
        String name = getLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static String getLine() {
        return scanner.nextLine();
    }
}
