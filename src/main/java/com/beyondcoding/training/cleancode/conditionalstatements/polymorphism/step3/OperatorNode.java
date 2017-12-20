package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step3;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.Node;

public abstract class OperatorNode implements Node {

    private Node left;

    private Node right;

    public OperatorNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    protected Node getRight() {
        return right;
    }

    protected Node getLeft() {
        return left;
    }
}
