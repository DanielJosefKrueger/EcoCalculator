package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.misc.Board;
import com.eco.items.util.Receipt;

public class StampMill extends Item {

    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new StampMill(), 1),
                new ItemAmount(new IronBar(), 5),
                new ItemAmount(new Screw(), 14),
                new ItemAmount(new IronGear(), 8),
                new ItemAmount(new Board(), 14)
        );
    }
}
