package hexlet.code.games;

import hexlet.code.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Prime extends Game {

    private static final int PRIME_BOUND = 28;

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public List<String> generateQuestionAndAnswer() {
        List<String> data = new ArrayList<>();
        int number = NumberGenerator.generate(PRIME_BOUND);
        data.add(String.valueOf(number));
        data.add(checkNum(number) ? "yes" : "no");
        return data;
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
