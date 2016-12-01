package com.beyondcoding.cleancode.conditional.polymorphism.step3;

public class ValueNode extends AbstractNode {

    private double value;

    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
