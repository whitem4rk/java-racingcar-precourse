package racingcar.view;

import racingcar.model.Car;
import racingcar.model.ScoreBoard;

public class RaceView {

    private static final String REQCARNAME = "경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)";
    private static final String REQCOUNT = "시도할 횟수는 몇회인가요?";
    private static final String RESULT = "실행결과";
    private static final String WINNERIS = "최종 우승자 : ";
    private static final String ROAD = "-";

    public static void printReqCarName() {
        System.out.println(REQCARNAME);
    }

    public static void printReqCount() {
        System.out.println(REQCOUNT);
    }

    public static void printResult() {
        System.out.println();
        System.out.println(RESULT);
    }

    public static void printWinner() {
        String[] winCars = new String[ScoreBoard.winList.size()];
        for (int i = 0; i < ScoreBoard.winList.size(); i++) {
            winCars[i] = ScoreBoard.winList.get(i).getName();
        }
        System.out.print(WINNERIS);
        System.out.println(String.join(", ", winCars));
    }

    public static void printRace() {
        for (Car car : ScoreBoard.carList) {
            System.out.println(car.getName() + " : " + ROAD.repeat(car.getScore()));
        }
        System.out.println();
    }
}
