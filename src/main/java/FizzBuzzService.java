public class FizzBuzzService {


    public String execute(int index){

        if(index % 15 ==0) {
            return "FizzBuzz";
        }else if(index % 3 ==0){
            return "Fizz";
        }
        else if(index % 5 ==0){
            return "Buzz";
        }
        return String.valueOf(index);
    }
}
