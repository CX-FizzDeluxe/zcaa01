package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_given_number_is_multiple_of_three() {
        assertThat(FizzBuzz.fizzBuzz(3), is("fizz"));
    }

    @Test
    public void return_fizz_when_given_number_has_a_three_in_it() {
        assertThat(FizzBuzz.fizzBuzz(13), is("fizz"));
    }

    @Test
    public void return_buzz_when_given_number_is_multiple_of_five() {
        assertThat(FizzBuzz.fizzBuzz(5), is("buzz"));
    }

    @Test
    public void return_fizz_buzz_when_given_number_is_multiple_of_three_and_five() {
        assertThat(FizzBuzz.fizzBuzz(15), is("fizz buzz"));
    }

    @Test
    public void return_the_number_when_given_number_is_not_multiple_of_three_or_five() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
    }
}
