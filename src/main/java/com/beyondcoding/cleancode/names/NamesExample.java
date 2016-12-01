package com.beyondcoding.cleancode.names;

public class NamesExample {

    public static void main(String[] args) {
        Fox fox = new FoxImpl();
        Bird bird = new BirdImpl();
        fox.hunt(bird);

        Cat cat = Cat.builder()
                     .setName("Mittens")
                     .setColor("grey")
                     .setAge(2)
                     .setFavouriteFood("tee & bisquits")
                     .build();

        cat.hunt(bird);
    }

}
