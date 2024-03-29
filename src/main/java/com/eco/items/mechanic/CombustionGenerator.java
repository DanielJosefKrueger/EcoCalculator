package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.util.Receipt;

public class CombustionGenerator extends Item {

    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new CombustionGenerator(), 1),
                new ItemAmount(new IronPiston(), 4),
                new ItemAmount(new IronBar(), 12),
                new ItemAmount(new CombustionEngine(), 1, false)
        );
    }
}
