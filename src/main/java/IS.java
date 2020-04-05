public class IS {
    public static boolean Fizz(int siraberu){
        if ( siraberu % 3 == 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Buzz(int siraberu){
        if ( siraberu % 5 == 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean FizzBuzz(int siraberu){
        if ( IS.Fizz(siraberu) && IS.Buzz(siraberu) ) {
            return true;
        } else {
            return false;
        }
    }
}
