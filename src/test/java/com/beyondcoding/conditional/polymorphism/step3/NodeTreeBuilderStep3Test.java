package com.beyondcoding.conditional.polymorphism.step3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.beyondcoding.cleancode.conditional.polymorphism.step3.Node;
import com.beyondcoding.cleancode.conditional.polymorphism.step3.NodeTreeBuilderStep3;

public class NodeTreeBuilderStep3Test {

    private NodeTreeBuilderStep3 nodeTreeBuilderStep3 = new NodeTreeBuilderStep3();

    @Test
    public void testEmptyExpression() {
        String expression = "";
        Node node = nodeTreeBuilderStep3.build(expression);
        assertThat(node).isNull();
    }

    @Test
    public void testValueExpression() {
        String expression = "1";
        Node node = nodeTreeBuilderStep3.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(1);
    }

    @Test
    public void testSingleOperatorExpression() {
        String expression = "1+2";
        Node node = nodeTreeBuilderStep3.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(3);
    }

    @Test
    public void testMultipleOperatorExpression() {
        String expression = "1+2*3";
        Node node = nodeTreeBuilderStep3.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(7);
    }

}
