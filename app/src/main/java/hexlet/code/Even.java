package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static int resultInRow = 0;

    public static int generateRandomIntInt() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    public static String evenGame() {
        Scanner scanner = new Scanner(System.in);
        String name = Cli.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (resultInRow < 3) {
            int toCheck = generateRandomIntInt();
            System.out.println("Question: " + toCheck);
            String yourAnswer = scanner.nextLine().toLowerCase();
            String correctAnswer = toCheck % 2 == 0 ? "yes" : "no";
            if (yourAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                resultInRow++;
            } else {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                return "Let's try again, " + name;
            }
        }
        return "Congratulations, " + name;
    }

}
