package com.beyondcoding.training.cleancode.unittests;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testEvaluate() {
        for (Map.Entry<Integer, String> entry : getEntries()) {
            assertValue(entry.getKey(), entry.getValue());
        }
    }

    private Set<Map.Entry<Integer, String>> getEntries() {
        HashMap<Integer, String> assertions = new HashMap<>();
        assertions.put(0, "0");
        assertions.put(1, "1");
        assertions.put(15, "fizzbuzz");
        assertions.put(5, "fizz0000");
        assertions.put(3, "buzz");
        assertions.put(0, "0");
        return assertions.entrySet();
    }

    private void assertValue(int value, String expectedResult) {
        String result = fizzBuzz.evaluate(value);
        Assert.assertEquals("Value:"+ value + " produced "+result + " but " + expectedResult + " was expected.", expectedResult, result);
    }

}
