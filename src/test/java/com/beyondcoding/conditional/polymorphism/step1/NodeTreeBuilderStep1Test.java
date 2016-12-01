package com.beyondcoding.conditional.polymorphism.step1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.beyondcoding.cleancode.conditional.polymorphism.step1.Node;
import com.beyondcoding.cleancode.conditional.polymorphism.step1.NodeTreeBuilderStep1;

public class NodeTreeBuilderStep1Test {

    private NodeTreeBuilderStep1 nodeTreeBuilderStep1 = new NodeTreeBuilderStep1();

    @Test
    public void testEmptyExpression() {
        String expression = "";
        Node node = nodeTreeBuilderStep1.build(expression);
        assertThat(node).isNull();
    }

    @Test
    public void testValueExpression() {
        String expression = "1";
        Node node = nodeTreeBuilderStep1.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.getOperator()).isEqualTo('#');
        assertThat(node.getValue()).isEqualTo(1);
        assertThat(node.evaluate()).isEqualTo(1);
    }

    @Test
    public void testSingleOperatorExpression() {
        String expression = "1+2";
        Node node = nodeTreeBuilderStep1.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.getOperator()).isEqualTo('+');
        assertThat(node.getValue()).isEqualTo(0);
        assertThat(node.evaluate()).isEqualTo(3);
    }

    @Test
    public void testMultipleOperatorExpression() {
        String expression = "1+2*3";
        Node node = nodeTreeBuilderStep1.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.getOperator()).isEqualTo('+');
        assertThat(node.getValue()).isEqualTo(0);
        assertThat(node.evaluate()).isEqualTo(7);
    }

}
