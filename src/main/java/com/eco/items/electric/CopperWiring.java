package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.CopperBar;
import com.eco.items.util.Receipt;

public class CopperWiring extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new CopperWiring(), 2),
                new ItemAmount(new CopperBar(), 4)
        );
    }

}
