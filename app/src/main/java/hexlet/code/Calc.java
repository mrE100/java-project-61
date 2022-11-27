package hexlet.code;


public class Calc extends Game {
    private static int firstNumber;
    private static int secondNumber;
    private static String action;
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
        this.firstNumber = new generateRandomIntFromOneToHundred().generate();
        this.secondNumber = new generateRandomIntFromOneToHundred().generate();
        int toActionNumber = new generateRandomIntFromOneToHundred().generate();
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
