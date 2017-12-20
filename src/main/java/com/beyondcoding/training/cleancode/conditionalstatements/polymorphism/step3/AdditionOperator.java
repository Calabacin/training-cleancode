package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class AdditionOperator extends OperatorNode {


    public AdditionOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() + getRight().evaluate();
    }

}
