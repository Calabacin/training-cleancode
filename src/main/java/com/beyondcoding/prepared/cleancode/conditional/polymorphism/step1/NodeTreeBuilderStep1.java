package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step1;

public class NodeTreeBuilderStep1 {

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
        Node valueNode = new Node();
        valueNode.setOperator('#');
        String value = String.valueOf(character);
        valueNode.setValue(Double.parseDouble(value));
        return valueNode;
    }

    private Node buildOperator(char first, char second, String rest) {
        Node operator = createOperatorNode(second);
        operator.setLeft(createValueNode(first));
        operator.setRight(build(rest));
        return operator;
    }

    private Node createOperatorNode(char operator) {
        Node operatorNode = new Node();
        operatorNode.setOperator(operator);
        operatorNode.setValue(0);
        return operatorNode;
    }

}
