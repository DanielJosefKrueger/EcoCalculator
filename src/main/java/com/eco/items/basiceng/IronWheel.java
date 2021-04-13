package com.eco.items.basiceng;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronGear;
import com.eco.items.util.Receipt;

public class IronWheel extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new IronWheel(), 1),
                new ItemAmount(new IronBar(), 6)
        );
    }
}
