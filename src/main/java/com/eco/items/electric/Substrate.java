package com.eco.items.electric;

import com.eco.items.FiberGlass;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.CopperBar;
import com.eco.items.oil.Epoxy;
import com.eco.items.util.Receipt;

public class Substrate extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Substrate(), 1),
                new ItemAmount(new FiberGlass(), 4),
                new ItemAmount(new Epoxy(), 4)
        );
    }

}
