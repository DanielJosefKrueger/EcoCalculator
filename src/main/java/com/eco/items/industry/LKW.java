package com.eco.items.industry;

import com.eco.items.CelluloseFiber;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.util.Receipt;

public class LKW extends Item {


    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new LKW(), 1),
                new ItemAmount(new GearBox(), 4),
                new ItemAmount(new CelluloseFiber(), 8),
                new ItemAmount(new SteelPlate(), 16),
                new ItemAmount(new RubberWheel(), 4, true),
                new ItemAmount(new Radiator(), 1, true),
                new ItemAmount(new CombustionEngine(), 1, true)
        );
    }
}
