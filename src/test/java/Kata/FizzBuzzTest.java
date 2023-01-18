package Kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzBuzzConverterNoChange () {

        final String esperado = "1";
        final String obtido = fizzBuzz.convert(1);
        assertEquals(esperado, obtido);
    }

    @Test
    void testFizzBuzzConverterMultipleOfThree () {

        final String esperado = "Fizz";
        final String obtido = fizzBuzz.convert(3);
        assertEquals(esperado, obtido);
    }

    @Test
    void testFizzBuzzConverterMultipleOfFive () {

        final String esperado = "Buzz";
        final String obtido = fizzBuzz.convert(5);
        assertEquals(esperado, obtido);
    }

    @Test
    void testFizzBuzzConverterMultipleOfThreeAndFive () {

        final String esperado = "FizzBuzz";
        final String obtido = fizzBuzz.convert(15);
        assertEquals(esperado, obtido);
    }

}
