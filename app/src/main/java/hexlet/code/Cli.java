package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        return scanner.nextLine();
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
