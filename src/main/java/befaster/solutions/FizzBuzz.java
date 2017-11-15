package befaster.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FizzBuzz {

    private static final String FIVE = "5";
    private static final String THREE = "3";

    public static String fizzBuzz(Integer number) {
        Set<String> result = new HashSet<>();

        if (isFizz(number)) {
            result.add("fizz");
        }

        if (isBuzz(number)) {
            result.add("buzz");
        }

        if(result.)
    }

    private static boolean isBuzz(Integer number) {
        return number % 5 == 0 || contains(FIVE, number);
    }

    private static boolean isFizz(Integer number) {
        return number % 3 == 0 || contains(THREE, number);
    }

    private static boolean isFizzBuzz(Integer number) {
        return number % 15 == 0 || (contains(THREE, number) && contains(FIVE, number));
    }

    private static boolean contains(String value, Integer number) {
        return String.valueOf(number)
                .contains(value);
    }
}
