package com.beyondcoding.training.cleancode.conditionalstatements.polymorphism;

import com.beyondcoding.training.cleancode.conditionalstatements.polymorphism.step1.NodeTreeBuilderStep1;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTreeBuilderTest {

    private NodeTreeBuilder nodeTreeBuilder = new NodeTreeBuilderStep1();

    @Test
    public void testEmptyExpression() {
        String expression = "";
        Node node = nodeTreeBuilder.build(expression);
        assertThat(node).isNull();
    }

    @Test
    public void testValueExpression() {
        String expression = "1";
        Node node = nodeTreeBuilder.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(1);
    }

    @Test
    public void testSingleOperatorExpression() {
        String expression = "1+2";
        Node node = nodeTreeBuilder.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(3);
    }

    @Test
    public void testMultipleOperatorExpression() {
        String expression = "1+2*3";
        Node node = nodeTreeBuilder.build(expression);
        assertThat(node).isNotNull();
        assertThat(node.evaluate()).isEqualTo(7);
    }

}
