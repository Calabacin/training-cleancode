package com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions;

import com.beyondcoding.training.cleancode.challenge.credit.CreditCardType;

public interface CreditCardCondition {

    boolean matches(String creditCardNumber);

    CreditCardType getType();

}
