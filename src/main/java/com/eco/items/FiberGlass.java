package com.eco.items;

import com.eco.items.bars.SteelBar;
import com.eco.items.industry.SteelGear;
import com.eco.items.industry.SteelGearBox;
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
