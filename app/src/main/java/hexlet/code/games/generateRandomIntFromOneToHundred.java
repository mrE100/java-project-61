package hexlet.code.games;

import java.util.Random;

public class generateRandomIntFromOneToHundred {
    public static int generate() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
}
