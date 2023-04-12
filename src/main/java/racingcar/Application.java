package racingcar;

import racingcar.controller.Race;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Race.start(new Scanner(System.in));
    }
}
