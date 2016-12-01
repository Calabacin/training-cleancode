package com.beyondcoding.cleancode.conditional.polymorphism.step4.node;

public class MultiplicationOperator extends OperatorNode {

    MultiplicationOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }

}
