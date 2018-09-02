package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizz;

    @Before
    public void setUp() {

        fizz = new FizzBuzzSolution();
    }

    @Test
    public void check_fizz_buzz() {
        assertThat(fizz.fizzBuzz(1), is("1"));
    }

    @Test
    public void check_fizz_buzz_mult_three() {
        assertThat(fizz.fizzBuzz(3), is("fizz"));
    }
    @Test
    public void check_fizz_buzz_mult_five() {
        assertThat(fizz.fizzBuzz(10), is("buzz"));
    }
    @Test
    public void check_fizz_buzz_both() {
        assertThat(fizz.fizzBuzz(15), is("fizz buzz"));
    }

}
