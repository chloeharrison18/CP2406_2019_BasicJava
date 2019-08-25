package week3;

import java.util.Random;

public class Game {
    int secret;
    int count;
    int wins;

    public Game(int min, int max) {
        Random random = new Random();
        secret = random.nextInt(max - min);
    }

    void makeGuess(int value) {
        // supposed to check wins and add counts.
        count += 1;
        if (value == secret) {
            wins += 1;
        }
    }
}
