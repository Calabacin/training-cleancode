package com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions;

import com.beyondcoding.training.cleancode.challenge.credit.CreditCardType;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.FirstDigitPrecondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.LengthPrecondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.Precondition;
import com.beyondcoding.training.cleancode.challenge.credit.preconditions.SecondDigitCondition;

import java.util.Arrays;
import java.util.List;

public class AmericanExpressCondition extends AbstractCreditCardCondition {

    @Override
    protected List<Precondition> getOrderedPreconditions() {
        return Arrays.asList(new LengthPrecondition(15),
                             new FirstDigitPrecondition(3),
                             new SecondDigitCondition(4, 7));
    }

    @Override
    public CreditCardType getType() {
        return CreditCardType.AMERICAN_EXPRESS;
    }

}
