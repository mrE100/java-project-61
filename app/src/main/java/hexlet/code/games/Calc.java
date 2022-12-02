package hexlet.code.games;

public final class Calc extends Game {
    private int firstNumber;
    private final int firstThird = 33;
    private final int secondThird = 66;
    private int secondNumber;
    private String action;
    public String printRules() {
        return "What is the result of the expression?";
    }
    public String getCorrectAnswer() {
        int result = 0;
        if (action.equals(" + ")) {
            result = firstNumber + secondNumber;
        } else if (action.equals(" - ")) {
            result = firstNumber - secondNumber;
        } else if (action.equals(" * ")) {
            result = firstNumber * secondNumber;
        }
        return String.valueOf(result);
    }
    public String generateQuestion() {
        this.firstNumber = GenerateRandomIntFromOneToHundred.generate();
        this.secondNumber = GenerateRandomIntFromOneToHundred.generate();
        int toActionNumber = GenerateRandomIntFromOneToHundred.generate();
        if (toActionNumber < firstThird) {
            this.action = " + ";
        } else if (toActionNumber < secondThird) {
            this.action = " - ";
        } else {
            this.action = " * ";
        }
        return firstNumber + action + secondNumber;
    }
}
