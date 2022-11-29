package hexlet.code;

public class Prime extends Game {
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
        number = generateRandomIntFromOneToHundred.generate();
        return String.valueOf(number);
    }

    private boolean checkNum(int number){
        for(int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
