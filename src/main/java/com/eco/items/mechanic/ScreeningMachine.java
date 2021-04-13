package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.misc.Board;
import com.eco.items.util.Receipt;

public class ScreeningMachine extends Item {

    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ScreeningMachine(), 1),
                new ItemAmount(new IronBar(), 40),
                new ItemAmount(new Screw(), 15),
                new ItemAmount(new IronGear(), 10)
        );
    }
}
