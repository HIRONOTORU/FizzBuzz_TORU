import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    @Test
    public void 引数15の時にFizzBuzzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "FizzBuzz", service.execute(15));
        //assertThat(,is(""));
    }

    @Test
    public void 引数5の時にBuzzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "Buzz", service.execute(5));
        //assertThat(,is(""));
    }

    @Test
    public void 引数3の時にBuzzがかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "Fizz", service.execute(3));
        //assertThat(,is(""));
    }

    @Test
    public void 引数1の時に1がかえってくるか() {
        FizzBuzzService service = new FizzBuzzService();
        assertEquals( "1", service.execute(1));
        //assertThat(,is(""));
    }
}
