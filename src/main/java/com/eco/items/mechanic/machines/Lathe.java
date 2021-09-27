package com.eco.items.mechanic.machines;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.basiceng.IronWheel;
import com.eco.items.mechanic.IronPlatte;
import com.eco.items.mechanic.Screw;
import com.eco.items.util.Receipt;

public class Lathe extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Lathe(), 1),
                new ItemAmount(new IronWheel(), 4),
                new ItemAmount(new IronPlatte(), 12)
        );
    }
}
