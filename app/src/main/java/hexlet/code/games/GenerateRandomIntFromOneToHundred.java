package hexlet.code.games;
import java.util.Random;

public final class GenerateRandomIntFromOneToHundred {
    private static final int BOUND = 100;
    public static int generate() {
        Random r = new Random();
        return r.nextInt(BOUND) + 1;
    }
}
