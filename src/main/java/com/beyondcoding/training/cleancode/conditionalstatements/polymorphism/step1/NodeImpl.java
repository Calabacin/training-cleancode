package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step1;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class NodeImpl implements Node {

    private char operator;

    private double value;

    private Node left;

    private Node right;

    public double evaluate() {
        switch (operator) {
            case '#':
                return value;
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

    public void setValue(double value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
