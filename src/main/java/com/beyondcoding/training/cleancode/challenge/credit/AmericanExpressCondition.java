package com.beyondcoding.training.cleancode.challenge.credit;

public class AmericanExpressCondition implements CreditCardCondition {

    @Override
    public boolean matches(String creditCardNumber) {
        int length = creditCardNumber.length();
        if(length != 15){
            return false;
        }
        int firstDigit = Integer.valueOf(creditCardNumber.charAt(0));
        if(firstDigit != '3'){
            return false;
        }
        int secondDigit = Integer.valueOf(creditCardNumber.charAt(1));
        if(secondDigit != '4' && secondDigit != '7'){
            return false;
        }
        return true;
    }

    @Override
    public CreditCardType getType() {
        return CreditCardType.AMERICAN_EXPRESS;
    }

}
