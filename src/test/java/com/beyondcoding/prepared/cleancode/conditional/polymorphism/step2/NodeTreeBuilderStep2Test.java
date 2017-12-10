package com.beyondcoding.prepared.cleancode.conditional.polymorphism.step2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NodeTreeBuilderStep2Test {

    private NodeTreeBuilderStep2 nodeTreeBuilderStep2 = new NodeTreeBuilderStep2();

    @Test
    public void testEmptyExpression() {
        String expression = "";
        Node node = nodeTreeBuilderStep2.build(expression);
        assertThat(node).isNull();
    }

    @Test
    public void testValueExpression() {
        String expression = "1";
        Node node = nodeTreeBuilderStep2.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(1);
    }

    @Test
    public void testSingleOperatorExpression() {
        String expression = "1+2";
        Node node = nodeTreeBuilderStep2.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(3);
    }

    @Test
    public void testMultipleOperatorExpression() {
        String expression = "1+2*3";
        Node node = nodeTreeBuilderStep2.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(7);
    }

}
