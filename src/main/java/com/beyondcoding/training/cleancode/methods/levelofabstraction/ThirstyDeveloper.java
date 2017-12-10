package com.beyondcoding.training.cleancode.methods.levelofabstraction;

public class ThirstyDeveloper {

    public void drinkThatGlassOfWater() {
        approachTheGlass();
        takeTheGlass();
        drinkTheWater();
        returnTheGlass();
    }

    private void approachTheGlass() {
        while(farAwayFromTheTable()){
            stepForward();
        }
    }

    private boolean farAwayFromTheTable() {
        return true;
    }

    private void stepForward() {}

    private void takeTheGlass() {}

    private void drinkTheWater() {}

    private void returnTheGlass() {}

}
