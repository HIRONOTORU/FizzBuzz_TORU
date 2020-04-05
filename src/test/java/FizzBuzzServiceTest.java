import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    @Test
    public void 引数15の時にFizzBuzzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "FizzBuzz", service.doing(15));
    }

    @Test
    public void 引数5の時にBuzzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "Buzz", service.doing(5));
    }

    @Test
    public void 引数3の時にFizzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "Fizz", service.doing(3));
    }

    @Test
    public void 引数1の時に1がかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "1", service.doing(1));
    }
}
