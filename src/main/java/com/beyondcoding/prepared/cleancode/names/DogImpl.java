package com.beyondcoding.prepared.cleancode.names;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DogImpl implements Dog {

    private String name;
    private String color;
    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void lookAt(Animal animal) {
        System.out.println(name + " is looking at " + animal.getName());
    }

}
