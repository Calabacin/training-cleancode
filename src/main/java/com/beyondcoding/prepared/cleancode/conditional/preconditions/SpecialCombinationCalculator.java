package com.beyondcoding.prepared.cleancode.conditional.preconditions;

public class SpecialCombinationCalculator {

    public int calculate(int number) {
        if (number % 2 == 0) {
            int result = number * 3;
            if (result > 100) {
                result -= 12;
                if (result % 7 == 0) {
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

}
