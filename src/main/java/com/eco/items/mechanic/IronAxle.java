package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.util.Receipt;

public class IronAxle extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new IronAxle(), 1),
                new ItemAmount(new IronBar(), 2)
        );
    }
}
