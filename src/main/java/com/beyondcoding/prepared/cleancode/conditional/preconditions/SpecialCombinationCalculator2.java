package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public class SpecialCombinationCalculator2 {

    public int calculate(int number) {
        if (isEven(number)) {
            int result = number * 3;
            if (isGreaterThan100(result)) {
                result -= 12;
                if (isDivisibleBy7(result)) {
                    return result * 13;
                } else {
                    return result;
                }
            } else {
                return result;
            }
        } else {
            return number;
        }
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    private boolean isGreaterThan100(int result) {
        return result > 100;
    }

    private boolean isDivisibleBy7(int result) {
        return result % 7 == 0;
    }

}
