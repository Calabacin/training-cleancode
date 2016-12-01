package com.beyondcoding.cleancode.methods.shopinglist;

import java.util.List;

public class MethodsExample {

    public ShoppingList prepareShoppingList(Recipe recipe) {
        ShoppingList shoppingList = new ShoppingList();
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient ingredient : ingredients) {
            if (iAmAlergicTo(ingredient)) {
                recipe.remove(ingredient);
            } else {
                shoppingList.add(ingredient);
            }
        }
        return shoppingList;
    }

    private boolean iAmAlergicTo(Ingredient ingredient) {
        return false;
    }

}
