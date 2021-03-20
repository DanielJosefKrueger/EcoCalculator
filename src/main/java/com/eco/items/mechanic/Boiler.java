package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.util.Receipt;

public class Boiler extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new IronGear(), 1),
                new ItemAmount(new Screw(), 10),
                new ItemAmount(new IronPlatte(), 15)
        );
    }
}
