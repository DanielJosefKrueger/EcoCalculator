package com.eco.items;

import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class FiberGlass extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new FiberGlass(), 1),
                new ItemAmount(new Plastic(), 4),
                new ItemAmount(new Glass(), 3)
        );
    }


}
