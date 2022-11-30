package hexlet.code.games;


public class Calc extends Game {
    private int firstNumber;
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
        this.firstNumber = generateRandomIntFromOneToHundred.generate();
        this.secondNumber = generateRandomIntFromOneToHundred.generate();
        int toActionNumber = generateRandomIntFromOneToHundred.generate();
        if (toActionNumber < 33) {
            this.action = " + ";
        } else if (toActionNumber < 66) {
            this.action = " - ";
        } else {
            this.action = " * ";
        }
        return firstNumber + action + secondNumber;
    }
}
