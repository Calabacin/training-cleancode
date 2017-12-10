package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public class IsEvenCalculation implements Calculation {

    @Override
    public boolean isNotApplicableTo(int number) {
        return !isEven(number);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public int calculate(int number) {
        return number * 3;
    }
}
