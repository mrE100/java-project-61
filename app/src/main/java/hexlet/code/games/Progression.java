package hexlet.code.games;
import java.util.Random;

public final class Progression extends Game {

    private int secretPosition;
    private int[] listOfNumbers;


    @Override
    public String printRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(listOfNumbers[secretPosition]);
    }

    @Override
    public String generateQuestion() {
        int upperBound = 10;
        int lowerBound = 5;
        int startingNumber = GenerateRandomIntFromOneToHundred.generate();
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
        return builder.toString();
    }
}
