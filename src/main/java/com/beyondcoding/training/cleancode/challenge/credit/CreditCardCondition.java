package com.beyondcoding.training.cleancode.challenge.credit;

public interface CreditCardCondition {

    boolean matches(String creditCardNumber);

    CreditCardType getType();

}
