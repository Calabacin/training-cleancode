package com.beyondcoding.cleancode.conditional.polymorphism.step4.node;

public abstract class OperatorNode extends AbstractNode {

    private Node left;

    private Node right;

    OperatorNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    protected Node getLeft() {
        return left;
    }

    protected Node getRight() {
        return right;
    }

}
