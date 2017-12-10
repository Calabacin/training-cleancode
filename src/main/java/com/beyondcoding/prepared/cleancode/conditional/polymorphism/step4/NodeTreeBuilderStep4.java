package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step4;

import com.beyondcoding.prepared.cleancode.conditional.polymorphism.step4.node.Node;
import com.beyondcoding.prepared.cleancode.conditional.polymorphism.step4.node.NodeFactory;

public class NodeTreeBuilderStep4 {

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

    private Node createValueNode(char value) {
        return NodeFactory.createValue(value);
    }

    private Node buildOperator(char first, char second, String rest) {
        return NodeFactory.createOperator(second, createValueNode(first), build(rest));
    }

}
