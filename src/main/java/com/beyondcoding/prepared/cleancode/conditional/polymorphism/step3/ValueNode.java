package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step3;

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
