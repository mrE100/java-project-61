package hexlet.code.games;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Progression extends Game {

    private int secretPosition;
    private final int upperBound = 10;
    private final int lowerBound = 5;
    private int[] listOfNumbers;


    @Override
    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }
    public String getCorrectAnswer() {
        return String.valueOf(listOfNumbers[secretPosition]);
    }

    @Override
    public List<String> generateQuestion() {
        List<String> question = new ArrayList<>();
        int startingNumber = NumberGenerator.generate();
        int stepOfTheProgression = new Random().nextInt(upperBound) + 1;
        int progressionLength = new Random().nextInt(upperBound - lowerBound) + lowerBound;
        secretPosition = new Random().nextInt(progressionLength);
        listOfNumbers = new int[progressionLength];
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
        question.add(builder.toString());
        question.add(getCorrectAnswer());
        return question;
    }
}
