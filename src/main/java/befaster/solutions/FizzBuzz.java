package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if(number % 15 == 0) {
            return "fizz buzz";
        } else if(number % 3 == 0 || contains("3", number)) {
            return "fizz";
        } else if(number % 5 == 0 || contains("5", number)) {
            return "buzz";
        }

        return String.valueOf(number);
    }

    private static boolean contains(String value, Integer number) {
        return String.valueOf(number)
                .contains(value);
    }
}
