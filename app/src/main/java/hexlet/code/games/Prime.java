package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

public final class Prime extends Game {
    private int number;
    private static final int SIMPLEBOUND = 28;
    @Override
    public void getRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public String getCorrectAnswer() {
        return checkNum(number) ? "yes" : "no";
    }

    @Override
    public List<String> generateQuestion() {
        List<String> question = new ArrayList<>();
        number = NumberGenerator.generate(SIMPLEBOUND);
        question.add(String.valueOf(number));
        question.add(getCorrectAnswer());
        return question;
    }

    private boolean checkNum(int numberToCheck) {
        if (numberToCheck <= 1) {
            return false;
        }
        for (int i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
