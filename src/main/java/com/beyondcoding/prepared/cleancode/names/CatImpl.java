package com.beyondcoding.prepared.cleancode.names;

public class CatImpl implements Cat {

    private String name;

    private String color;

    private int age;

    private String favouriteFood;

    CatImpl(String name, String color, int age, String favouriteFood) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println(getName() + " hunts a " + animal.getName());
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    @Override
    public String getName() {
        return name;
    }

}
