package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.util.Receipt;

public class Screw extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Screw(), 4),
                new ItemAmount(new IronBar(), 1)
        );
    }
}
