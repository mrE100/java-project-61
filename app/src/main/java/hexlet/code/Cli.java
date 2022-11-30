package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
