package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if(number % 15 == 0) {
            return "fizz buzz";
        } else if(number % 3 == 0 || containsThree(number)) {
            return "fizz";
        } else if(number % 5 == 0 || containsFive(number)) {
            return "buzz";
        }

        return String.valueOf(number);
    }

    private static boolean containsFive(Integer number) {
        return String.valueOf(number)
                .contains("5");
    }

    private static boolean containsThree(Integer number) {
        return String.valueOf(number)
                .contains("3");
    }
}
