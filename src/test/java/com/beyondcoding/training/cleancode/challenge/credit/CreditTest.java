package com.beyondcoding.training.cleancode.challenge.credit;

import org.junit.Assert;
import org.junit.Test;

public class CreditTest {

    private Credit credit = new Credit();

    @Test
    public void testAmericanExpress(){
        assertCreditCard("378282246310005", CreditCardType.AMERICAN_EXPRESS);
        assertCreditCard("371449635398431", CreditCardType.AMERICAN_EXPRESS);
    }

    private void assertCreditCard(String creditCardNumber, CreditCardType expectedType) {
        CreditCardType type = credit.check(creditCardNumber);
        Assert.assertEquals(expectedType, type);
    }

    @Test
    public void testMastercard(){
        assertCreditCard("5555555555554444", CreditCardType.MASTERCARD);
        assertCreditCard("5105105105105100", CreditCardType.MASTERCARD);
    }

    @Test
    public void testVisa(){
        assertCreditCard("4111111111111111", CreditCardType.VISA);
        assertCreditCard("4012888888881881", CreditCardType.VISA);
    }

    @Test
    public void testInvalid(){
        assertCreditCard("6176292929", CreditCardType.INVALID);
        assertCreditCard("510510510510212", CreditCardType.INVALID);
    }

}
