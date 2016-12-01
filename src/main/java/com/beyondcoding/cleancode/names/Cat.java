package com.beyondcoding.cleancode.names;

public interface Cat extends Animal {

    void hunt(Animal animal);

    static CatBuilder builder() {
        return new CatBuilder();
    }

}
