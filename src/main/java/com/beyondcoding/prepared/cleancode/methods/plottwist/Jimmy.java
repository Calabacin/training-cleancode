package com.beyondcoding.prepared.cleancode.methods.plottwist;

import java.util.Optional;

public class Jimmy {

    private Spoon spoon;

    private Soup soup;

    public void eatTheSoup() {
        try {
            eatTheSoupWithMySpoon();
        }
        catch (NoSpoonException nse) {
            eatTheSoupWithAnotherSpoon();
        }
        catch (SoupTooHotException sthe) {
            eatTheSoupAfterSomeMinutes();
        }
    }

    private void eatTheSoupWithMySpoon() throws NoSpoonException, SoupTooHotException {
        Optional<Spoon> spoon = getMySpoon();
        if (!spoon.isPresent()) {
            throw new NoSpoonException();
        }
        eatTheSoup(spoon);
    }

    private Optional<Spoon> getMySpoon() {
        return Optional.ofNullable(spoon);
    }

    private void eatTheSoup(Optional<Spoon> spoon) throws SoupTooHotException {
        if (isSoupTooHot()) {
            System.out.println("The soup is too hot!");
            throw new SoupTooHotException();
        }
        System.out.println("The soup was delicious");
    }

    private boolean isSoupTooHot() {
        return soup.isTooHot();
    }

    private void eatTheSoupWithAnotherSpoon() {
        System.out.println("I couldn't find my spoon. I'll get a new one.");
        spoon = getAnotherSpoon();
        eatTheSoup();
    }

    private Spoon getAnotherSpoon() {
        return new Spoon();
    }

    private void eatTheSoupAfterSomeMinutes() {
        waitForSomeMinutes();
        eatTheSoup();
    }

    private void waitForSomeMinutes() {
        System.out.println("I'll wait for a while.");
        int fiveSeconds = 1000 * 5;
        try {
            Thread.sleep(fiveSeconds);
        }
        catch (InterruptedException e) {
            System.out.println("Sorry. Couln't wait any more.");
        }
    }

    public Spoon getSpoon() {
        return spoon;
    }

    public void setSpoon(Spoon spoon) {
        this.spoon = spoon;
    }

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

}
