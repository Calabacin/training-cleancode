package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step3;

public abstract class OperatorNode implements Node {

    private Node left;

    private Node right;

    public OperatorNode(Node left, Node right) {
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
