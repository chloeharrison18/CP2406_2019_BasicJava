package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret is assigned a random value between 1-10

    int count;
    int wins;

    void makeGuess(int value) {
        // supposed to check wins and add counts.
        count += 1;
        if (value == secret) {
            wins += 1;
        }
    }
}
