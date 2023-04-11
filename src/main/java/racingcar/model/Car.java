package racingcar.model;

public class Car {
    public Car(String name, int score) {
        this.name = name;
        this.score = score;
    }

    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
