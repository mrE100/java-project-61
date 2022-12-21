package hexlet.code.games;

import hexlet.code.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Calc extends Game {
    private static final int BOUND = 16;
    private static final String[] OPERAND = {" + ", " - ", " * "};

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }
    public List<String> generateQuestionAndAnswer() {
        List<String> data = new ArrayList<>();
        int firstNumber = NumberGenerator.generate(BOUND);
        int secondNumber = NumberGenerator.generate(BOUND);
        int operationIndex = NumberGenerator.generate(0, OPERAND.length - 1);
        int result;
        switch (operationIndex) {
            case 0:
                result = firstNumber + secondNumber;
                break;
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown operand!");
        }
        String action = OPERAND[operationIndex];
        data.add(firstNumber + action + secondNumber);
        data.add(String.valueOf(result));
        return data;
    }
}
