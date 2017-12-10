package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public class IsGreaterThan100Calculation implements Calculation {

    @Override
    public boolean isNotApplicableTo(int number) {
        return ! isGreaterThan100(number);
    }

    private boolean isGreaterThan100(int number) {
        return number > 100;
    }

    @Override
    public int calculate(int number) {
        return number - 12;
    }
}
