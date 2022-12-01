package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public abstract class Game {
    private static int resultInRow = 0;
    private final String name = Cli.getName();
    private final Scanner scanner = new Scanner(System.in);


    /**
     * rules, question and correct answer should be realized for each game
      */
    public void play() {
        System.out.println(printRules());
        while (resultInRow < 3) {
            System.out.println("Question: " + generateQuestion());
            String yourA = this.scanner.nextLine().toLowerCase();
            String correctA = getCorrectAnswer();
            if (yourA.equals(correctA)) {
                System.out.println("Correct!");
                resultInRow++;
            } else {

                System.out.println("'" + yourA + "' is wrong answer ;(. Correct answer was '" + correctA + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (resultInRow == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    /**
     *
     * @return a string with game rules
     */
    public abstract String printRules();

    /**
     *
     * @return a String with correct answer
     */
    public abstract String  getCorrectAnswer();

    /**
     *
     * @return a string with question
     */
    public abstract String generateQuestion();

}
