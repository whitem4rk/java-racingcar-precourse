package racingcar.model;

public class Car {
    private static final int ZERO = 0;
    private final String name;
    private int score;

    public Car(String name) {
        this.name = name;
        this.score = ZERO;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score += 1;
    }
}
