package com.eco.items;

import com.eco.items.util.Receipt;

public abstract class Item {

    public abstract Receipt getReceipt();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
