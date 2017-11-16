package befaster.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    private static final String FIVE = "5";
    private static final String THREE = "3";
    private static final String SPACE = " ";

    public static String fizzBuzz(Integer number) {
        List<String> result = new ArrayList<>();

        if (isFizz(number)) {
            addToResult(number, result, "fizz", 3, THREE);
        }

        if (isBuzz(number)) {
            addToResult(number, result, "buzz", 5, FIVE);
        }

        if (result.isEmpty()) {
            return String.valueOf(number);
        }

        return result.stream()
                .collect(Collectors.joining(SPACE));
    }

    private static void addToResult(Integer number, List<String> result, String fizz, int multiple, String three) {
        result.add(fizz);
        if (isDeluxe(number, multiple, three)) {
            result.add("deluxe");
        }
    }

    private static boolean isDeluxe(Integer number, Integer multiple, String toContain) {
        return number % multiple == 0 && contains(toContain, number);
    }

    private static boolean isBuzz(Integer number) {
        return number % 5 == 0 || contains(FIVE, number);
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0 || contains(THREE, number);
    }

    private static boolean contains(String value, Integer number) {
        return String.valueOf(number)
                .contains(value);
    }
}
