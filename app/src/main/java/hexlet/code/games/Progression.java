package hexlet.code.games;
import hexlet.code.NumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Progression extends Game {
    private static final int UPPER_BOUND = 10;
    private static final int LOWER_BOUND = 5;

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public List<String> generateQuestionAndAnswer() {
        List<String> data = new ArrayList<>();
        int startingNumber = NumberGenerator.generate();
        int stepOfTheProgression = new Random().nextInt(UPPER_BOUND) + 1;
        int progressionLength = new Random().nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
        int secretPosition = new Random().nextInt(progressionLength);
        int[] listOfNumbers = new int[progressionLength];
        listOfNumbers[0] = startingNumber;

        for (int i = 1; i < progressionLength; i++) {
            listOfNumbers[i] = listOfNumbers[i - 1] + stepOfTheProgression;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < progressionLength; i++) {
            if (i == secretPosition) {
                builder.append(".. ");
            } else {
                builder.append(listOfNumbers[i]).append(" ");
            }
        }
        data.add(builder.toString());
        data.add(String.valueOf(listOfNumbers[secretPosition]));
        return data;
    }
}
