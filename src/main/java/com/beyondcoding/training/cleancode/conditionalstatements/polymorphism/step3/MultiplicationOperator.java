package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class MultiplicationOperator extends OperatorNode {

    public MultiplicationOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }

}
