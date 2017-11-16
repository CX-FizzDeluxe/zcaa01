package befaster.solutions;

import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FizzBuzz {

    private static final String FIVE = "5";
    private static final String THREE = "3";
    private static final String SPACE = " ";

    public static String fizzBuzz(Integer number) {
        List<String> result = new ArrayList<>();

        if (isFizz(number)) {
            result.add("fizz");
        }

        if (isBuzz(number)) {
            result.add("buzz");
        }

        if(isDeluxe(number)) {
            if(number % 2 != 0) {
                result.add("fake");
            }
            result.add("deluxe");
        }

        if (result.isEmpty()) {
            return String.valueOf(number);
        }

        return result.stream()
                .collect(Collectors.joining(SPACE));
    }

    private static boolean isDeluxe(Integer number) {
        return number > 10 && digitsAreIdentical(number);
    }

    private static boolean digitsAreIdentical(Integer number) {
        return Chars.asList(String.valueOf(number).toCharArray())
                .stream()
                .distinct()
                .limit(2)
                .count() <= 1;
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
