package com.beyondcoding.prepared.cleancode.structure;

public class Pet {

    private String name;

    private String type;

    private int age;

    private String hairColor;

    private Pet(String name, String type, int age, String hairColor) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hairColor = hairColor;
    }

    public static PetBuilder builder() {
        return new PetBuilder();
    }

    public static class PetBuilder {

        private String name;

        private String type;

        private int age;

        private String hairColor;

        public PetBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PetBuilder type(String type) {
            this.type = type;
            return this;
        }

        public PetBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PetBuilder hairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Pet build() {
            return new Pet(name, type, age, hairColor);
        }

    }

}
