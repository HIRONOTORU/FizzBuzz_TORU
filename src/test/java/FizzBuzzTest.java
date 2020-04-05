import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void Fizzの真偽判定が正しいか() {
        assertEquals( true, IS.Fizz(3));
    }
    @Test
    public void Buzzの真偽判定が正しいか() {
        assertEquals( true, IS.Buzz(5));
    }
    @Test
    public void FizzBuzzの真偽判定が正しいか() {
        assertEquals( true, IS.FizzBuzz(15));
    }

}