package com.beyondcoding.prepared.tdd.fizzbuzz.original;

public class FizzBuzz {

    public String getResult(int value) {
        if (value % 15 == 0) {
            return "fizzbuzz";
        }
        if (value % 5 == 0) {
            return "buzz";
        }
        if (value % 3 == 0) {
            return "fizz";
        }
        return Integer.toString(value);
    }

}
