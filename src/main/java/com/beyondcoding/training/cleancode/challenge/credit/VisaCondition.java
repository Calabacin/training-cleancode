package com.beyondcoding.training.cleancode.challenge.credit;

public class VisaCondition implements CreditCardCondition {

    @Override
    public boolean matches(String creditCardNumber) {
        int length = creditCardNumber.length();
        if(length != 13 && length != 16){
            return false;
        }
        int firstDigit = creditCardNumber.charAt(0);
        if(firstDigit != '4'){
            return false;
        }
        return true;
    }

    @Override
    public CreditCardType getType() {
        return CreditCardType.VISA;
    }

}
