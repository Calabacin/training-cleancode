package com.beyondcoding.prepared.cleancode.methods.shopinglist;

import java.util.List;

public interface Recipe {

    void add(Ingredient ingredient);

    void remove(Ingredient ingredient);

    List<Ingredient> getIngredients();

}
