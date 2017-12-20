package com.beyondcoding.training.cleancode.unittests;

public class IsDivisibleByCondition implements Condition{

    private int divisor;

    private String value;

    public IsDivisibleByCondition(int divisor, String value) {
        this.divisor = divisor;
        this.value = value;
    }

    @Override
    public boolean isMet(int value) {
        return value % divisor == 0;
    }

    @Override
    public String getValue() {
        return value;
    }
}
