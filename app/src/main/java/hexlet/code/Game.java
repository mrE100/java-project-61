package hexlet.code;

import java.util.Scanner;

public abstract class Game {
    static int resultInRow = 0;
    String name = Cli.getName();
    Scanner scanner = new Scanner(System.in);
    public void play() {
        System.out.println(printRules());
        while (resultInRow < 3) {
            System.out.println("Question: " + generateQuestion());
            String yourAnswer = this.scanner.nextLine().toLowerCase();
            String correctAnswer = getCorrectAnswer();
            if (yourAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                resultInRow++;
            } else {
                System.out.println("'" + yourAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (resultInRow == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public abstract String printRules();

    public abstract String  getCorrectAnswer();

    public abstract String generateQuestion();

}
