package com.beyondcoding.training.cleancode.unittests;

import java.util.Arrays;
import java.util.List;

class FizzBuzzConditionFactory {

    private FizzBuzzConditionFactory() {
    }

    static List<Condition> getOrderedConditions() {
        return Arrays.asList(new EqualsZeroCondition(),
                             new IsDivisibleByCondition(15, "fizzbuzz"),
                             new IsDivisibleByCondition(5, "fizz"),
                             new IsDivisibleByCondition(3, "buzz"));
    }
}
