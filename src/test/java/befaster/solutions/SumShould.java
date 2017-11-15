package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumShould {

    @Test
    public void compute_sum_of_two_valid_integers() {
        assertThat(Sum.sum(1, 1), equalTo(2));
    }

    @Test
    public void throw_an_exception_when_first_param_is_not_betwee_zero_and_100() {
        assertThat(, is());
    }
}