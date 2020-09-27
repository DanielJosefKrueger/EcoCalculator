package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.CopperBar;
import com.eco.items.bars.GoldBar;
import com.eco.items.util.Receipt;

public class GoldWiring extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new GoldWiring(), 2),
                new ItemAmount(new GoldBar(), 4)

        );
    }
}
