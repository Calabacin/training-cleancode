package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step2;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;
import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.NodeTreeBuilder;
import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step1.NodeImpl;

public class NodeTreeBuilderStep2 implements NodeTreeBuilder {

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
        ValueNode valueNode = new ValueNode();
        String value = String.valueOf(character);
        valueNode.setValue(Double.parseDouble(value));
        return valueNode;
    }

    private Node buildOperator(char first, char second, String rest) {
        OperatorNode operator = createOperatorNode(second);
        operator.setLeft(createValueNode(first));
        operator.setRight(build(rest));
        return operator;
    }

    private OperatorNode createOperatorNode(char operator) {
        OperatorNode operatorNode = new OperatorNode();
        operatorNode.setOperator(operator);
        return operatorNode;
    }

}
