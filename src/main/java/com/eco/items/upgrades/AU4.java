package com.eco.items.upgrades;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Lumber;
import com.eco.items.mechanic.CombustionEngine;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.IronPlatte;
import com.eco.items.util.Receipt;

public class AU4 extends Item {

    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new AU4(), 1),
                new ItemAmount(new IronPlatte(), 6),
                new ItemAmount(new IronPiston(), 8),
                new ItemAmount(new Lumber(), 12),
                new ItemAmount(new AU3(), 1, false)
        );
    }
}
