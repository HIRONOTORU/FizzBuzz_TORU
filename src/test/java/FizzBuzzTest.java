import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    int counter;
    @Test
    public void Fizz() {
        assertEquals( "Fizz", FizzBuzz.san());
        //assertThat(,is(""));
    }
    @Test
    public void Buzz() {
        assertEquals( "Buzz", FizzBuzz.gou());
        //assertThat(,is(""));
    }
}