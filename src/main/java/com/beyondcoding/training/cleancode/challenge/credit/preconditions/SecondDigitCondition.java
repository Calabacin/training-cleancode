package com.beyondcoding.training.cleancode.challenge.credit.preconditions;

import com.beyondcoding.training.cleancode.challenge.credit.util.DigitUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondDigitCondition implements Precondition {

    private List<Integer> expectedSecondDigits;

    public SecondDigitCondition(Integer... expectedSecondDigits) {
        this.expectedSecondDigits = Stream.of(expectedSecondDigits)
                                          .collect(Collectors.toList());
    }

    @Override
    public boolean isInvalid(String creditCardNumber) {
        if (creditCardNumber.length() < 2) {
            return true;
        }
        int secondDigit = DigitUtils.getDigitAt(1, creditCardNumber);
        return noneMatches(secondDigit);
    }

    private boolean noneMatches(int secondDigit) {
        return expectedSecondDigits.stream()
                                   .noneMatch(expectedDigit -> expectedDigit == secondDigit);
    }

}
