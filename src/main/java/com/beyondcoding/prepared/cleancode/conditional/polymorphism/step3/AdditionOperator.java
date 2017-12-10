package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step3;

public class AdditionOperator extends OperatorNode {

    public AdditionOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() + getRight().evaluate();
    }

}
