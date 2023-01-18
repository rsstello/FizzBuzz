package Kata;

public class FizzBuzz {
    public String convert(int toConvertToFizzBuzz) {

        if (toConvertToFizzBuzz%15==0)
            return "FizzBuzz";
        if(toConvertToFizzBuzz%3==0){
            return "Fizz";
        }
        if(toConvertToFizzBuzz%5==0){
            return "Buzz";
        }
        return String.valueOf(toConvertToFizzBuzz);
    }

}
