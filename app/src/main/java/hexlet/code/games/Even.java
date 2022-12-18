package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

public final class Even extends Game {
    private int toCheck;
    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public String getCorrectAnswer() {
        return toCheck % 2 == 0 ? "yes" : "no";
    }
    public List<String> generateQuestion() {
        List<String> question = new ArrayList<>();
        toCheck = NumberGenerator.generate();
        question.add(String.valueOf(toCheck));
        question.add(getCorrectAnswer());
        return question;
    }

}
