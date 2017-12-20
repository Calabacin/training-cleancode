package com.beyondcoding.training.cleancode.challenge.credit.preconditions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthPrecondition implements Precondition {

    private List<Integer> expectedLengths;

    public LengthPrecondition(Integer... expectedLengths) {
        this.expectedLengths = Stream.of(expectedLengths)
                                     .collect(Collectors.toList());
    }

    @Override
    public boolean isInvalid(String creditCardNumber) {
        int length = creditCardNumber.length();
        return expectedLengths.stream()
                              .noneMatch(expectedLength -> expectedLength == length);
    }

}
