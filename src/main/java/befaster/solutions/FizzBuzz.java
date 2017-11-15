package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number % 15 == 0 || (contains("3", number) && contains("5", number))) {
            return "fizz buzz";
        } else if (number % 3 == 0 || contains("3", number)) {
            return "fizz";
        } else if (number % 5 == 0 || contains("5", number)) {
            "buzz";
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
