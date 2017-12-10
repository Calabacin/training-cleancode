package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step1;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;
import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.NodeTreeBuilder;

public class NodeTreeBuilderStep1 implements NodeTreeBuilder {

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
        NodeImpl valueNode = new NodeImpl();
        valueNode.setOperator('#');
        String value = String.valueOf(character);
        valueNode.setValue(Double.parseDouble(value));
        return valueNode;
    }

    private Node buildOperator(char first, char second, String rest) {
        NodeImpl operator = createOperatorNode(second);
        operator.setLeft(createValueNode(first));
        operator.setRight(build(rest));
        return operator;
    }

    private NodeImpl createOperatorNode(char operator) {
        NodeImpl operatorNode = new NodeImpl();
        operatorNode.setOperator(operator);
        operatorNode.setValue(0);
        return operatorNode;
    }

}
