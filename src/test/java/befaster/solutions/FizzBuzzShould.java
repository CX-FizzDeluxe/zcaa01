package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_given_number_is_multiple_of_three() {
        assertThat(FizzBuzz.fizzBuzz(3), is("fizz"));
    }
}
