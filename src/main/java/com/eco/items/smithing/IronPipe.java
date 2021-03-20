package com.eco.items.smithing;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronGear;
import com.eco.items.util.Receipt;

public class IronPipe extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new IronPipe(), 1),
                new ItemAmount(new IronBar(), 2)
        );
    }
}
