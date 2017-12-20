package com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions;

import com.beyondcoding.training.cleancode.challenge.credit.preconditions.Precondition;

import java.util.List;

public abstract class AbstractCreditCardCondition implements CreditCardCondition {

    @Override
    public boolean matches(String creditCardNumber) {
        List<Precondition> preconditions = getOrderedPreconditions();
        for (Precondition precondition : preconditions) {
            if(precondition.isInvalid(creditCardNumber)){
                return false;
            }
        }
        return true;
    }

    protected abstract List<Precondition> getOrderedPreconditions();

}
