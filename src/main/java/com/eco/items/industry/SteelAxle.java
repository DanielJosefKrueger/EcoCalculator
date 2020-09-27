package com.eco.items.industry;

import com.eco.items.CelluloseFiber;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.oil.Epoxy;
import com.eco.items.util.Receipt;

public class SteelAxle extends Item {
    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new SteelAxle(), 1),
                new ItemAmount(new SteelBar(), 4),
                new ItemAmount(new Epoxy(), 3)
        );
    }

}
