package hexlet.code.games;

public final class Prime extends Game {
    private int number;
    @Override
    public String printRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getCorrectAnswer() {
        return checkNum(number) ? "yes" : "no";
    }

    @Override
    public String generateQuestion() {
        number = GenerateRandomIntFromOneToHundred.generate();
        return String.valueOf(number);
    }

    private boolean checkNum(int numberToCheck) {
        for (int i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
