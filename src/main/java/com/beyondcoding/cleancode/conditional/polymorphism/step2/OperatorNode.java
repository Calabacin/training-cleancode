package com.beyondcoding.cleancode.conditional.polymorphism.step2;

public class OperatorNode extends AbstractNode {

    private char operator;

    private Node left;

    private Node right;

    public OperatorNode(char operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        switch (operator) {
        case '+':
            return left.evaluate() + right.evaluate();
        case '*':
            return left.evaluate() * right.evaluate();
        default:
            throw new IllegalStateException("Operation not supported: " + operator);
        }
    }

}
