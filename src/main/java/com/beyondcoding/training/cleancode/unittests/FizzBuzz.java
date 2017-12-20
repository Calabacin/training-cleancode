package com.beyondcoding.training.cleancode.unittests;

import java.util.List;

public class FizzBuzz {

    public String evaluate(int value) {
        List<Condition> conditions = getOrderedConditions();
        for (Condition condition : conditions) {
            if (condition.isMet(value)) {
                return condition.getValue();
            }
        }
        return String.valueOf(value);
    }

    private List<Condition> getOrderedConditions() {
        return FizzBuzzConditionFactory.getOrderedConditions();
    }
}
