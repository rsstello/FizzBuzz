package Kata;

import org.junit.jupiter.api.Test;

public class FinalFizzBuzzTest {

    @Test
    public void hundredFizzBuzz(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
