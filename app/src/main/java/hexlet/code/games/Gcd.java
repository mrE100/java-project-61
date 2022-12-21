package hexlet.code.games;

import hexlet.code.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Gcd extends Game {
    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    private int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    @Override
    public List<String> generateQuestionAndAnswer() {
        List<String> data = new ArrayList<>();
        int firstNumber = NumberGenerator.generate();
        int secondNumber = NumberGenerator.generate();
        data.add(firstNumber + " " + secondNumber);
        data.add(String.valueOf(gcdByEuclidsAlgorithm(firstNumber, secondNumber)));
        return data;
    }
}
