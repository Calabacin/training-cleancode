package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public class NodeFactory {

    private NodeFactory() {
    }

    public static Node createValueNode(char character) {
        ValueNode valueNode = new ValueNode();
        String value = String.valueOf(character);
        valueNode.setValue(Double.parseDouble(value));
        return valueNode;
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
