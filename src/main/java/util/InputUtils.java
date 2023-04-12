package util;

public class InputUtils {
    private static final String COMMA = ",";

    public static String[] stringToList(String nextLine) {
        String[] names = nextLine.split(COMMA);
        checkLessThanOne(names);
        checkNameLength(names);
        return names;
    }

    private static void checkNameLength(String[] names) {
        for (String s : names) {
            if (s.length() > 5) {
                throw new IllegalArgumentException("[ERROR] 차의 이름이 5자 초과입니다.");
            }
        }
    }

    private static void checkLessThanOne(String[] names) {
        if (names.length < 1) {
            throw new IllegalArgumentException("[ERROR] 참가자 수가 1보다 작습니다.");
        }
    }


    public static int stringToInt(String count) {
        checkNumber(count);
        checkMoreThanZero(count);
        return Integer.parseInt(count);
    }

    private static void checkNumber(String count) {
        for (int i = 0; i < count.length(); i++) {
            if (!Character.isDigit(count.charAt(i))) {
                throw new IllegalArgumentException("[ERROR] 입력한 시도 횟수가 숫자가 아닙니다.");
            }
        }
    }

    private static void checkMoreThanZero(String count) {
        if (!(Integer.parseInt(count) > 0)) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 0보다 커야합니다.");
        }
    }
}
