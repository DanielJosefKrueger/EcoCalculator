package com.eco.items.industry;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.oil.Epoxy;
import com.eco.items.util.Receipt;

public class SteelGear extends Item {
    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new SteelGear(), 1),
                new ItemAmount(new SteelBar(), 2),
                new ItemAmount(new Epoxy(), 1)
        );
    }
}
