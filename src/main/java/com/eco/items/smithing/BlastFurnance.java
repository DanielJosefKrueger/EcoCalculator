package com.eco.items.smithing;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Lumber;
import com.eco.items.basiceng.IronWheel;
import com.eco.items.mechanic.*;
import com.eco.items.misc.Leather;
import com.eco.items.stone.Brick;
import com.eco.items.util.Receipt;

public class BlastFurnance extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Steamtruck(), 1),
                new ItemAmount(new Screw(), 12),
                new ItemAmount(new Brick(), 8),
                new ItemAmount(new IronPlatte(), 12),
                new ItemAmount(new IronPipe(), 8)
        );
    }
}
