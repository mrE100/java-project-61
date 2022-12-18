package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

public final class Gcd extends Game {
    private int firstNumber;
    private int secondNumber;
    @Override
    public void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    private int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public String getCorrectAnswer() {
        return String.valueOf(gcdByEuclidsAlgorithm(firstNumber, secondNumber));
    }

    @Override
    public List<String> generateQuestion() {
        List<String> question = new ArrayList<>();
        firstNumber = NumberGenerator.generate();
        secondNumber = NumberGenerator.generate();
        question.add(firstNumber + " " + secondNumber);
        question.add(getCorrectAnswer());
        return question;
    }
}
