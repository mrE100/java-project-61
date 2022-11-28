package hexlet.code;

public class Gnd extends Game {
    private int firstNumber;
    private int secondNumber;
    @Override
    public String printRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    private int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    @Override
    public String getCorrectAnswer() {
        return String.valueOf(gcdByEuclidsAlgorithm(firstNumber, secondNumber));
    }

    @Override
    public String generateQuestion() {
        firstNumber = generateRandomIntFromOneToHundred.generate();
        secondNumber = generateRandomIntFromOneToHundred.generate();
        return firstNumber + " " + secondNumber;
    }
}
