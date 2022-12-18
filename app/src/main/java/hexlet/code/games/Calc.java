package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

public final class Calc extends Game {
    private final String[] operand = {" + ", " - ", " * "};

    public void getRules() {
        System.out.println("What is the result of the expression?");
    }
    public List<String> generateQuestion() {
        List<String> question = new ArrayList<>();
        int firstNumber = NumberGenerator.generate(16);
        int secondNumber = NumberGenerator.generate(16);
        int toActionNumber = NumberGenerator.generate(0, 2);
        int result = 0;
        switch (toActionNumber) {
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
            }
        String action = operand[toActionNumber];
        question.add(firstNumber + action + secondNumber);
        question.add(String.valueOf(result));
        return question;
    }
}
