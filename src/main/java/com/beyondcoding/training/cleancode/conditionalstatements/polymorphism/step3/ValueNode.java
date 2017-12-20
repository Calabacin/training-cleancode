package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class ValueNode implements Node {

    private double value;

    public double evaluate() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
