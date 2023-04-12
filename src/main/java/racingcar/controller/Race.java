package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.ScoreBoard;
import racingcar.view.RaceView;
import util.InputUtils;

import java.util.Random;
import java.util.Scanner;

public class Race {

    private static final int CRITERION = 4;
    private static final Random random = new Random();

    public static void start(Scanner scanner) {
        RaceView.printReqCarName();
        createCars(InputUtils.stringToList(scanner.nextLine()));
        RaceView.printReqCount();
        setCount(InputUtils.stringToInt(scanner.nextLine()));
        RaceView.printResult();
        play();
        compareCars();
        RaceView.printWinner();
    }

    private static void createCars(String[] names) {
        ScoreBoard.reset();
        for (String name : names) {
            ScoreBoard.addCar(new Car(name));
        }
    }

    private static void setCount(int count) {
        ScoreBoard.setCount(count);
    }

    private static void play() {
        for (int i = 0; i < ScoreBoard.count; i++) {
            goOrStopAllCars();
            RaceView.printRace();
        }
    }

    private static void goOrStopAllCars() {
        for (int i = 0; i < ScoreBoard.carList.size(); i++) {
            int number = random.nextInt(10);
            if (number >= CRITERION) {
                ScoreBoard.scoreUp(i);
            }
        }
    }

    private static void compareCars() {
        for (Car car : ScoreBoard.carList) {
            ScoreBoard.topScore = Math.max(ScoreBoard.topScore, car.getScore());
        }
        for (Car car : ScoreBoard.carList) {
            if (car.getScore() == ScoreBoard.topScore) {
                ScoreBoard.winList.add(car);
            }
        }

    }
}
