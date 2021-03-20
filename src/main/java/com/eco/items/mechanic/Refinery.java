package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.SteelGear;
import com.eco.items.stone.Brick;
import com.eco.items.util.Receipt;

public class Refinery extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Refinery(), 1),
                new ItemAmount(new Brick(), 12),
                new ItemAmount(new IronBar(), 4),
                new ItemAmount(new IronGear(), 23)

        );
    }

}
