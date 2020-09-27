package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.GoldBar;
import com.eco.items.util.Receipt;

public class GoldFlakes extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new GoldFlakes(), 4),
                new ItemAmount(new GoldBar(), 2)

        );
    }

}
