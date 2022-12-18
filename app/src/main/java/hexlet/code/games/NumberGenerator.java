package hexlet.code.games;
import java.util.Random;

public final class NumberGenerator {
    private static final int DEFAULTBOUND = 100;
    public static int generate() {
        Random r = new Random();
        return r.nextInt(DEFAULTBOUND) + 1;
    }
    public static int generate(int bound) {
        Random r = new Random();
        return r.nextInt(bound) + 1;
    }

    public static int generate(int min, int bound) {
        Random r = new Random();
        return r.nextInt((bound - min) + 1) + min;
    }
}
