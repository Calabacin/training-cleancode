package com.beyondcoding.prepared.cleancode.methods.plottwist;

public class PlotTwistExample {

    public static void main(String[] args) {
        Jimmy jimmy = new Jimmy();
        Spoon jimmysSpoon = new Spoon();
        jimmy.setSpoon(jimmysSpoon);
        jimmy.setSoup(new HotSoup(1));

        jimmy.eatTheSoup();
    }

}
