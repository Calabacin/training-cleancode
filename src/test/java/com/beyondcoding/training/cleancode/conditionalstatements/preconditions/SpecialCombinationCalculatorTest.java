package com.beyondcoding.training.cleancode.conditionalstatements.preconditions;

import com.beyondcoding.prepared.cleancode.conditional.preconditions.SpecialCombinationCalculator4;
import org.junit.Assert;
import org.junit.Test;


public class SpecialCombinationCalculatorTest {

    private SpecialCombinationCalculator originalCalculator = new SpecialCombinationCalculator();

    @Test
    public void testResult() {
        int result = originalCalculator.calculate(8);
        Assert.assertEquals(24, result);
    }

    @Test
    public void testResultAfterRefactoring() {
    }

}
