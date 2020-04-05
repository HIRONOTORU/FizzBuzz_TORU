public class FizzBuzzService {
    public String doing(int index){
        if(  IS.FizzBuzz(index) ) {
            return "FizzBuzz";
        } else if( IS.Fizz(index) ) {
            return "Fizz";
        } else if( IS.Buzz(index) ) {
            return "Buzz";
        } else {
            return String.valueOf(index);
        }
    }
}
