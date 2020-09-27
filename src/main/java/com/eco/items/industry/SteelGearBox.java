package com.eco.items.industry;

import com.eco.items.CelluloseFiber;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.oil.Epoxy;
import com.eco.items.util.Receipt;

public class SteelGearBox extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new SteelGearBox(), 1),
                new ItemAmount(new SteelBar(), 8),
                new ItemAmount(new SteelGear(), 4)
        );
    }

}
