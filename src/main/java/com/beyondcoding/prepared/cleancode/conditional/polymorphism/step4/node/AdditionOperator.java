package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step4.node;

public class AdditionOperator extends OperatorNode {

    AdditionOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() + getRight().evaluate();
    }

}
