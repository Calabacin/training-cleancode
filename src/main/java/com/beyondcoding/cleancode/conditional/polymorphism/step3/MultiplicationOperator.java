package com.beyondcoding.cleancode.conditional.polymorphism.step3;

public class MultiplicationOperator extends OperatorNode {

    public MultiplicationOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }

}
