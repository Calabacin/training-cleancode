package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step4.node;

public class ValueNode implements Node {

    private double value;

    ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
