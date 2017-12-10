package com.beyondcoding.prepared.cleancode.names;

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

        Dog dog = DogImpl.builder()
                         .name("Buddy")
                         .color("brown")
                         .age(2)
                         .build();

        dog.lookAt(bird);
    }

}
