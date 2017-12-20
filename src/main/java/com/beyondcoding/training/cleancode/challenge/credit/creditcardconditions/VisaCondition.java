package com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions;

import com.beyondcoding.training.cleancode.challenge.credit.CreditCardType;
import com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions.CreditCardCondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.FirstDigitPrecondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.LengthPrecondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.Precondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.SecondDigitCondition;

import java.util.Arrays;
import java.util.List;

public class VisaCondition extends AbstractCreditCardCondition {

    @Override
    protected List<Precondition> getOrderedPreconditions() {
        return Arrays.asList(new LengthPrecondition(13, 16),
                             new FirstDigitPrecondition(4));
    }

    @Override
    public CreditCardType getType() {
        return CreditCardType.VISA;
    }

}
