package com.beyondcoding.prepared.cleancode.methods.shopinglist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<Ingredient> ingredients = new ArrayList<>();

    public void add(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

}
