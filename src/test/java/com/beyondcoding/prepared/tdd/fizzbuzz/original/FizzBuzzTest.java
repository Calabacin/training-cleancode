package com.beyondcoding.prepared.tdd.fizzbuzz.original;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 *
 * Return “fizz”, “buzz” or “fizzbuzz”.
 *
 * For a given natural number greater than zero return:
 *
 * “fizz” if the number is dividable by 3 “buzz” if the number is dividable by 5
 * “fizzbuzz” if the number is dividable by 15 the same number if no other
 * requirement is fulfilled
 *
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testNumberIsDivisibleBy3() {
        assertThat(fizzBuzz.getResult(3)).isEqualTo("fizz");
        assertThat(fizzBuzz.getResult(6)).isEqualTo("fizz");
    }

    @Test
    public void testNumberIsDivisibleBy5() {
        assertThat(fizzBuzz.getResult(5)).isEqualTo("buzz");
        assertThat(fizzBuzz.getResult(10)).isEqualTo("buzz");
    }

    @Test
    public void testNumberIsDivisibleBy15() {
        assertThat(fizzBuzz.getResult(15)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.getResult(30)).isEqualTo("fizzbuzz");
    }

    @Test
    public void testNumberIsNotDivisible() {
        assertThat(fizzBuzz.getResult(1)).isEqualTo("1");
        assertThat(fizzBuzz.getResult(2)).isEqualTo("2");
        assertThat(fizzBuzz.getResult(4)).isEqualTo("4");
    }

}
