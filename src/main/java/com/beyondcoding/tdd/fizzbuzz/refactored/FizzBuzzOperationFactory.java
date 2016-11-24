package com.beyondcoding.tdd.fizzbuzz.refactored;

public class FizzBuzzOperationFactory {

    public static FizzBuzzOperation createFor(Integer value) {
        if (isValueModuleOf(value, 15)) {
            return new FizzBuzz();
        }
        if (isValueModuleOf(value, 5)) {
            return new Buzz();
        }
        if (isValueModuleOf(value, 3)) {
            return new Fizz();
        }
        return new OtherFizzBuzzOperation(value);
    }

    private static boolean isValueModuleOf(Integer value, int module) {
        return value % module == 0;
    }

    private FizzBuzzOperationFactory() {}

}
