package com.eco.items;

import com.eco.items.bars.CopperBar;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class HeatSink extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new HeatSink(), 1),
                new ItemAmount(new CopperBar(), 8)
        );
    }
}
