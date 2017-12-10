package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step1;

public class Node {

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

    public String display() {
        switch (operator) {
        case '#':
            return String.valueOf(value);
        case '+':
        case '*':
            return left.display() + operator + right.display();
        default:
            throw new IllegalArgumentException("Operation not supported: " + operator);
        }
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [operator=" + operator + ", value=" + value + "]";
    }

}
