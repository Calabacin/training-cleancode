package com.beyondcoding.training.cleancode.challenge.credit;

import com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions.AmericanExpressCondition;
import com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions.CreditCardCondition;
import com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions.MastercardCondition;
import com.beyondcoding.training.cleancode.challenge.credit.creditcardconditions.VisaCondition;

import java.util.Arrays;
import java.util.List;

public class CreditCardDeterminer {

    private List<CreditCardCondition> conditions = Arrays.asList(new AmericanExpressCondition(),
                                                                 new MastercardCondition(),
                                                                 new VisaCondition());

    public CreditCardType determine(String creditCardNumber){
        for (CreditCardCondition condition: conditions) {
            if(condition.matches(creditCardNumber)){
                return condition.getType();
            }
        }
        return CreditCardType.INVALID;
    }

}
