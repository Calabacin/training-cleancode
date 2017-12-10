package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public class IsDivisibleBy7Calculation implements Calculation {

    @Override
    public boolean isNotApplicableTo(int number) {
        return ! isDivisibleBy7(number);
    }

    private boolean isDivisibleBy7(int result) {
        return result % 7 == 0;
    }

    @Override
    public int calculate(int number) {
        return number * 13;
    }
}
