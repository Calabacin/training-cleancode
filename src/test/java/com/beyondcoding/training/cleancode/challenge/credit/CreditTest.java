package com.beyondcoding.training.cleancode.challenge.credit;

import org.junit.Assert;
import org.junit.Test;

public class CreditTest {

    private Credit credit = new Credit();

    @Test
    public void testAmericanExpress(){
        String creditCardNumber = "378282246310005";
        CreditCardType type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.AMERICAN_EXPRESS, type);

        creditCardNumber = "371449635398431";
        type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.AMERICAN_EXPRESS, type);
    }

    @Test
    public void testMastercard(){
        String creditCardNumber = "5555555555554444";
        CreditCardType type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.MASTERCARD, type);

        creditCardNumber = "5105105105105100";
        type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.MASTERCARD, type);
    }

    @Test
    public void testVisa(){
        String creditCardNumber = "4012888888881881";
        CreditCardType type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.VISA, type);

        creditCardNumber = "4012888888881881";
        type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.VISA, type);
    }

    @Test
    public void testInvalid(){
        String creditCardNumber = "6176292929";
        CreditCardType type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.INVALID, type);

        creditCardNumber = "510510510510212";
        type = credit.check(creditCardNumber);
        Assert.assertEquals(CreditCardType.INVALID, type);
    }

}
