package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if(number % 15 == 0) {

        }else if(number % 3 == 0) {
            return "fizz";
        } else if(number % 5 == 0) {
            return "buzz";
        }

        return null;
    }

}
