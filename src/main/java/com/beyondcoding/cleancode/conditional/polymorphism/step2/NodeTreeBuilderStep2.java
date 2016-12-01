package com.beyondcoding.cleancode.conditional.polymorphism.step2;

public class NodeTreeBuilderStep2 {

    public Node build(String expression) {
        int length = expression.length();
        if (length == 0) {
            return null;
        }
        char first = expression.charAt(0);
        if (length == 1) {
            return createValueNode(first);
        }
        char second = expression.charAt(1);
        String rest = expression.substring(2);
        switch (second) {
        case '+':
        case '*':
            return buildOperator(first, second, rest);
        default:
            throw new IllegalStateException("Expected operator but found: " + second);
        }

    }

    private Node createValueNode(char character) {
        String stringValue = String.valueOf(character);
        double value = Double.parseDouble(stringValue);
        return new ValueNode(value);
    }

    private Node buildOperator(char first, char second, String rest) {
        return new OperatorNode(second, createValueNode(first), build(rest));
    }

}
