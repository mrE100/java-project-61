package hexlet.code.games;

public final class Even extends Game {
    private int toCheck;
    public String printRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String getCorrectAnswer() {
        return toCheck % 2 == 0 ? "yes" : "no";
    }
    public String generateQuestion() {
        toCheck = new GenerateRandomIntFromOneToHundred().generate();
        return String.valueOf(toCheck);
    }

}
