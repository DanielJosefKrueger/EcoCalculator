package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.basiceng.IronWheel;
import com.eco.items.misc.Cloth;
import com.eco.items.smithing.IronPipe;
import com.eco.items.util.Receipt;

public class MechanicalPump extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new MechanicalPump(), 1),
                new ItemAmount(new IronBar(), 8),
                new ItemAmount(new IronPipe(), 8)
        );
    }
}
