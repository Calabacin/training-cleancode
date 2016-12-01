package com.beyondcoding.cleancode.conditional.polymorphism.step4.node;

public class ValueNode extends AbstractNode {

    private double value;

    ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}
