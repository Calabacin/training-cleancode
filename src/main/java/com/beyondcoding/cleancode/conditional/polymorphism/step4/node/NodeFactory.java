package com.beyondcoding.cleancode.conditional.polymorphism.step4.node;

public class NodeFactory {

    private NodeFactory() {}

    public static Node createValue(char value) {
        String stringValue = String.valueOf(value);
        double parseDouble = Double.parseDouble(stringValue);
        return new ValueNode(parseDouble);
    }

    public static Node createOperator(char operator, Node left, Node right) {
        switch (operator) {
        case '+':
            return new AdditionOperator(left, right);
        case '*':
            return new MultiplicationOperator(left, right);
        default:
            throw new IllegalStateException("Operation not supported: " + operator);
        }
    }

}
