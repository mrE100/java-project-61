package hexlet.code.games;

import java.util.List;
import java.util.Scanner;

public abstract class Game {
    private int resultInRow = 0;
    private static final int ROUNDS = 3;

    /**
     *
     * rules, question and correct answer should be realized for each game.
      */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(getRules());
        while (resultInRow < ROUNDS) {
            List<String> questionAndAnswer = generateQuestionAndAnswer();
            String answer = questionAndAnswer.get(1);
            System.out.println("Question: " + questionAndAnswer.get(0));
            String userAnswer = scanner.nextLine().toLowerCase();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                resultInRow++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
            System.out.println("Congratulations, " + name + "!");
    }

    /**
     * @return a String with rules
     */
    public abstract String getRules();


    /**
     * @return a List with question and correct answer
     */
    public abstract List<String> generateQuestionAndAnswer();

}
