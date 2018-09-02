package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizz;

    @Before
    public void setUp() {

        fizz = new FizzBuzzSolution();
    }

    @Test
    public void check_fizz_buzz() {
        assertThat(fizz.fizzBuzz(1), is(1));
    }

    @Test
    public void check_fizz_buzz() {
        assertThat(fizz.fizzBuzz(1), is(1));
    }

}
