package com.beyondcoding.training.cleancode.unittests;


public class EqualsZeroCondition implements Condition {


    @Override
    public boolean isMet(int value) {
        return value == 0;
    }

    @Override
    public String getValue() {
        return "0";
    }
}
