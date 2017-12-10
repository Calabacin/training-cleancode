package com.beyondcoding.prepared.cleancode.names;

public class CatBuilder {

    private String name;

    private String color;

    private int age;

    private String favouriteFood;

    public CatBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CatBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CatBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CatBuilder setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public Cat build() {
        return new CatImpl(name, color, age, favouriteFood);
    }

}
