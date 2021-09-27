package com.eco.items.mechanic.machines;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronPlatte;
import com.eco.items.mechanic.Screw;
import com.eco.items.util.Receipt;

public class Shaper extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Shaper(), 1),
                new ItemAmount(new IronPlatte(), 12),
                new ItemAmount(new Screw(), 30)
        );
    }
}
