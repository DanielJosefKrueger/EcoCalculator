package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.stone.Brick;
import com.eco.items.util.Receipt;

public class SteamEngine extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new Refinery(), 1),
                new ItemAmount(new IronPiston(), 12),
                new ItemAmount(new Screw(), 23),
                new ItemAmount(new IronPlatte(), 23),
                new ItemAmount(new Boiler(), 6),
                new ItemAmount(new IronGear(), 16)
                );
    }
}
