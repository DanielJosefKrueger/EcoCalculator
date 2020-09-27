package com.eco.items.industry;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.*;
import com.eco.items.oil.Rubber;
import com.eco.items.util.Receipt;

public class RubberWheel extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new RubberWheel(), 1),
                new ItemAmount(new Rubber(), 8),
                new ItemAmount(new SteelBar(), 4)
        );
    }


}
