package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloShould {

    private static final String EMPTY = "";

    @Test
    public void return_hello_world() {
        assertThat(Hello.hello(EMPTY), is("Hello, World!"));
    }
}
