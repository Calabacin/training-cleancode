package com.beyondcoding.training.cleancode.conditionalstatements.preconditions;

public class RefactoredSpecialCombinationCalculator {

    public int calculate(int number) {
        if (number % 2 != 0) {
            return number;
        }

        int result = number * 3;
        if (result <= 100) {
            return result;
        }

        result -= 12;
        if (result % 7 != 0) {
            return result;
        }

        return result * 13;
    }
}
