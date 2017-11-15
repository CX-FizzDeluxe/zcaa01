package befaster.solutions;

public class FizzBuzz {

    private static final String FIVE = "5";
    private static final String THREE = "3";

    public static String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();

        if (isFizz(number)) {
            result.append("fizz");
        }

        if (isBuzz(number)) {
            result.append("buzz");
        }

        return result.toString();
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
