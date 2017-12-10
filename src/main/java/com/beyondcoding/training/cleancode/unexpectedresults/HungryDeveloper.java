package com.beyondcoding.training.cleancode.unexpectedresults;


import com.beyondcoding.training.cleancode.unexpectedresults.support.NoSpoonException;
import com.beyondcoding.training.cleancode.unexpectedresults.support.SoupTooHotException;

public class HungryDeveloper {

    public void eatTheSoup() {
        try {
            eatTheSoupWithMySpoon();
        } catch (NoSpoonException nse) {
            eatTheSoupWithAnotherSpoon();
        } catch (SoupTooHotException sthe) {
            eatTheSoupAfterSomeMinutes();
        }
    }

    private void eatTheSoupWithMySpoon() throws NoSpoonException, SoupTooHotException { }

    private void eatTheSoupWithAnotherSpoon() { }

    private void eatTheSoupAfterSomeMinutes() { }


}
