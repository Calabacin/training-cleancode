package com.beyondcoding.prepared.tdd.fizzbuzz.refactored;

public class FizzBuzzOperator {

    public String getResult(int value) {
        FizzBuzzOperation fizzBuzzOperation = FizzBuzzOperationFactory.createFor(value);
        return fizzBuzzOperation.execute();
    }

}
