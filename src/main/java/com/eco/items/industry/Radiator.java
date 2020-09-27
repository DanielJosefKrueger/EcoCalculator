package com.eco.items.industry;

import com.eco.items.HeatSink;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.electric.*;
import com.eco.items.util.Receipt;

public class Radiator extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Radiator(), 1),
                new ItemAmount(new HeatSink(), 4),
                new ItemAmount(new CopperWiring(), 8)
        );
    }


}
