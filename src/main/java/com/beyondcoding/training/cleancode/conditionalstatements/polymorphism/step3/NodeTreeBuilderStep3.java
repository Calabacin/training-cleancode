package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;
import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.NodeTreeBuilder;

public class NodeTreeBuilderStep3 implements NodeTreeBuilder {

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
        return buildOperator(first, second, rest);
    }

    private Node createValueNode(char character) {
        return NodeFactory.createValueNode(character);
    }

    private Node buildOperator(char first, char second, String rest) {
        return NodeFactory.createOperator(second, createValueNode(first), build(rest));
    }

}
