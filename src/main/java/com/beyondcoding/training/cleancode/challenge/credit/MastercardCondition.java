package com.beyondcoding.training.cleancode.challenge.credit;

public class MastercardCondition implements CreditCardCondition {

    @Override
    public boolean matches(String creditCardNumber) {
        int length = creditCardNumber.length();
        if(length != 16){
            return false;
        }
        int firstDigit = creditCardNumber.charAt(0);
        if(firstDigit != '5'){
            return false;
        }
        int secondDigit = creditCardNumber.charAt(1);
        if(secondDigit < '1' || secondDigit > '5'){
            return false;
        }
        return true;
    }

    @Override
    public CreditCardType getType() {
        return CreditCardType.MASTERCARD;
    }

}
