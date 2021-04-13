package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.basiceng.IronWheel;
import com.eco.items.misc.Cloth;
import com.eco.items.util.Receipt;

public class Bicycle extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Bicycle(), 1),
                new ItemAmount(new Cloth(), 4),
                new ItemAmount(new IronBar(), 8),
                new ItemAmount(new IronWheel(), 2, true)
        );
    }
}
