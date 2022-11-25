package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static int resultInRow = 0;
    private static String name;

    public static int generateRandomIntInt() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    public static String evenGame() {
        Scanner scanner = new Scanner(System.in);
        name = Cli.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (resultInRow < 3) {
            int toCheck = generateRandomIntInt();
            System.out.println("Question: " + toCheck);
            String yourAnswer = scanner.nextLine().toLowerCase();
            if ((yourAnswer.equals("yes") && toCheck % 2 == 0) || (yourAnswer.equals("no") && toCheck % 2 != 0)) {
                System.out.println("Correct!");
                resultInRow++;
            } else {
                resultInRow = 0;
            }
        }
        return "Congratulations, " + name;
    }

}
