package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

public final class Even extends Game {
    private int number;
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public Boolean isEven() {
        return number % 2 == 0;
    }
    public List<String> generateQuestionAndAnswer() {
        List<String> data = new ArrayList<>();
        number = NumberGenerator.generate();
        data.add(String.valueOf(number));
        data.add(isEven() ? "yes" : "no");
        return data;
    }

}
