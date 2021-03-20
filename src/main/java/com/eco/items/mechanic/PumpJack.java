package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.stone.ReinforcedConcrete;
import com.eco.items.util.Receipt;

public class PumpJack extends Item {

    public Receipt getReceipt() {
        return new Receipt( new ItemAmount(new PumpJack(), 1),
                new ItemAmount(new ReinforcedConcrete(), 12),
                new ItemAmount(new GearBox(), 4),
                new ItemAmount(new IronPiston(), 8)
        );
    }
}
