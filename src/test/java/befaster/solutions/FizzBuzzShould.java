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
    public void return_buzz_when_given_number_has_a_five_in_it() {
        assertThat(FizzBuzz.fizzBuzz(59), is("buzz"));
    }

    @Test
    public void return_fizz_buzz_when_given_number_is_multiple_of_three_and_five() {
        assertThat(FizzBuzz.fizzBuzz(15), is("fizz buzz"));
    }

    @Test
    public void return_fizz_buzz_when_given_number_contains_both_three_and_five() {
        assertThat(FizzBuzz.fizzBuzz(53), is("fizz buzz"));
    }

    @Test
    public void return_fizz_buzz_when_given_number_contains_five_and_multiple_of_three() {
        assertThat(FizzBuzz.fizzBuzz(546), is("fizz buzz"));
    }

    @Test
    public void return_the_number_when_given_number_is_not_multiple_of_three_or_five() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
    }

    @Test
    public void return_deluxe_to_result_if_number_is_greater_than_ten_and_all_numbers_are_identical() {
        assertThat(FizzBuzz.fizzBuzz(77), is("deluxe"));
    }

    @Test
    public void return_fizz_deluxe_if_number_is_greater_than_ten_and_all_numbers_are_identical_and_contains_three() {
        assertThat(FizzBuzz.fizzBuzz(333), is("fizz deluxe"));
    }

    @Test
    public void return_fake_deluxe_if_number_is_greater_than_ten_and_all_numbers_are_identical_and_is_odd() {
        assertThat(FizzBuzz.fizzBuzz(1111), is("fake deluxe"));
    }


}
