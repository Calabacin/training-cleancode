package com.beyondcoding.prepared.cleancode.names;

public class FoxImpl implements Fox {

    @Override
    public void hunt(Animal animal) {
        System.out.println("Hunted a " + animal.getName());
    }

    @Override
    public String getName() {
        return "Fox";
    }

}
