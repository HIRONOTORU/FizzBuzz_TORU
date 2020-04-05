import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzzService Service = new FizzBuzzService();
        for ( int counter = 1 ; counter <= 100 ; counter++ ) {
            System.out.println(Service.doing(counter));

            /*
            if ( (counter % 15) == 0 ) {
                //System.out.println("FizzBuzz");
                System.out.printf("%s%s\n",san(),gou());
            } else if ( (counter % 3) == 0) {
                //System.out.println("Fizz");
                System.out.println(san());
            } else if ( (counter % 5) == 0) {
                //System.out.println("Buzz");
                System.out.println(gou());
            } else {
                System.out.printf("%d\n",kaz(counter));
            }
            */
        }
        return;
    }
    /*
    public static String san() {
        //System.out.println("Fizz");
        return "Fizz";
    }

    public static String gou() {
        //System.out.println("Buzz");
        return "Buzz";
    }

    public static int kaz(int number) {
        //System.out.printf("%d\n",number);
        return number;
    }
     */
}
