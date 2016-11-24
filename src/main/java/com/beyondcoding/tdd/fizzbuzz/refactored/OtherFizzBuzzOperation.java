package com.beyondcoding.tdd.fizzbuzz.refactored;

public class OtherFizzBuzzOperation extends AbstractFizzBuzzOperation {

    private Integer value;

    public OtherFizzBuzzOperation(Integer value) {
        this.value = value;
    }

    @Override
    public String execute() {
        return String.valueOf(value);
    }

}
