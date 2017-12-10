package com.beyondcoding.prepared.cleancode.conditional.preconditions;

import java.util.Arrays;
import java.util.List;

public class SpecialCombinationCalculator4 {

    public int calculate(int number) {
        int result = number;
        for (Calculation calculation : getOrderedCalculations()) {
            if (calculation.isNotApplicableTo(result)) {
                return result;
            }
            result = calculation.calculate(result);
        }
        return result;
    }

    private List<Calculation> getOrderedCalculations() {
        return Arrays.asList(new IsEvenCalculation(),
                             new IsGreaterThan100Calculation(),
                             new IsDivisibleBy7Calculation());
    }


}
