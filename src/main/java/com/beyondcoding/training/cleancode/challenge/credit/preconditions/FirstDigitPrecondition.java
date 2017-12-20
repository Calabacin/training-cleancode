package com.beyondcoding.training.cleancode.challenge.credit.preconditions;

import com.beyondcoding.training.cleancode.challenge.credit.util.DigitUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstDigitPrecondition implements Precondition {

    private List<Integer> expectedFirstDigits;

    public FirstDigitPrecondition(Integer... expectedFirstDigits) {
        this.expectedFirstDigits = Stream.of(expectedFirstDigits)
                                         .collect(Collectors.toList());
    }

    @Override
    public boolean isInvalid(String creditCardNumber) {
        if (creditCardNumber.length() < 1) {
            return true;
        }
        int firstDigit = DigitUtils.getDigitAt(0, creditCardNumber);
        return noneMatches(firstDigit);
    }

    private boolean noneMatches(int firstDigit) {
        return expectedFirstDigits.stream()
                                  .noneMatch(expectedDigit -> expectedDigit == firstDigit);
    }
}
