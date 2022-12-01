package hexlet.code.games;

import java.util.Random;

public final class generateRandomIntFromOneToHundred {
    public static int generate() {
        Random r = new Random();
        int bound = 100;
        return r.nextInt(bound) + 1;
    }
}
