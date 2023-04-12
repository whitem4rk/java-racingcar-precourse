package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {
    public static final List<Car> carList = new ArrayList<>();
    public static final List<Car> winList = new ArrayList<>();
    public static int topScore;
    public static int count;

    public static void reset() {
        winList.clear();
        carList.clear();
        topScore = 0;
    }

    public static void addCar(Car car) {
        carList.add(car);
    }

    public static void setCount(int inputCount) {
        count = inputCount;
    }

    public static void scoreUp(int carIdx) {
        carList.get(carIdx).addScore();
    }

}
