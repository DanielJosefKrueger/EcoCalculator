package com.eco.items.util;

import com.eco.items.ItemAmount;

import java.util.Arrays;

public class Receipt {

    private final ItemAmount result;
    private final ItemAmount[] ingredients;

    public Receipt(ItemAmount result, ItemAmount... ingredients) {
        this.result = result;
        this.ingredients = ingredients;
    }


    public ItemAmount getResult() {
        return result;
    }

    public ItemAmount[] getIngredients() {
        return ingredients;
    }


    @Override
    public String toString() {
        return result.getItem().getClass().getSimpleName() + "-Receipt";
    }
}
