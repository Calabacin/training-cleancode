package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step2;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class OperatorNode implements Node {

    private char operator;

    private Node left;

    private Node right;

    public double evaluate() {
        switch (operator) {
            case '+':
                return left.evaluate() + right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
            default:
                throw new IllegalArgumentException("Operation not supported: " + operator);
        }
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
