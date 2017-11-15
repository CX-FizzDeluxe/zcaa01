package befaster.solutions;

import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class HelloShould {

    @Test
    public void return_hello_world() {
        assertThat(Hello.hello(EMPTY), is("Hello world!!"));
    }
}
