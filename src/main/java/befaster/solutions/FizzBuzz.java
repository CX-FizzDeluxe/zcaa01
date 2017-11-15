package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();

        if (number % 15 == 0) {
            result.append("fizz buzz");
        } else if (number % 3 == 0 || contains("3", number)) {
            result.append("fizz");
        } else if (number % 5 == 0 || contains("5", number)) {
            result.append("buzz");
        } else {
            result.append(number);
        }

        return result.toString();
    }

    private static boolean contains(String value, Integer number) {
        return String.valueOf(number)
                .contains(value);
    }
}
