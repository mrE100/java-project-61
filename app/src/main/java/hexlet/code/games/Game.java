package hexlet.code.games;
import hexlet.code.Cli;

import java.util.List;

public abstract class Game {
    private int resultInRow = 0;
    private static final int gamesToWin = 3;

    /**
     *
     * rules, question and correct answer should be realized for each game.
      */
    public void play() {
        final String name = Cli.getName();
        getRules();
        while (resultInRow < gamesToWin) {
            List<String> question = generateQuestion();
            System.out.println("Question: " + question.get(0));
            String yourA = Cli.getLine().toLowerCase();
            if (yourA.equals(question.get(1))) {
                System.out.println("Correct!");
                resultInRow++;
            } else {

                System.out.println("'" + yourA + "' is wrong answer ;(. Correct answer was '" + question.get(1) + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (resultInRow == gamesToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    /**
     *
     *  a string with game rules
     */
    public abstract void getRules();


    /**
     * @return a List with question and correct answer
     */
    public abstract List<String> generateQuestion();

}
