package com.beyondcoding.cleancode.conditional.polymorphism.step2;

public class ValueNode implements Node {

    private double value;

    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
