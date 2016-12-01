package com.beyondcoding.cleancode.methods.plottwist;

public class HotSoup extends Soup {

    private int hotCounters;

    public HotSoup(int hotCounters) {
        this.hotCounters = hotCounters;
    }

    @Override
    public boolean isTooHot() {
        hotCounters--;
        return hotCounters >= 0;
    }

}
