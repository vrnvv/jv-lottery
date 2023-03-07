package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_COUNT = 100;

    public Ball getRandomBall() {
        int number = new Random().nextInt(RANDOM_COUNT);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color,number);
    }
}