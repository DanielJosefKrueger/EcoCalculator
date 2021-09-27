package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Lumber;
import com.eco.items.basiceng.IronWheel;
import com.eco.items.misc.Leather;
import com.eco.items.smithing.IronPipe;
import com.eco.items.util.Receipt;

public class Steamtruck extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Steamtruck(), 1),
                new ItemAmount(new IronPlatte(), 12, true),
                new ItemAmount(new IronPipe(), 8, true),
                new ItemAmount(new Screw(), 24, true),
                new ItemAmount(new Leather(), 20, true),
                new ItemAmount(new Lumber(), 30, true),
                new ItemAmount(new PortableSteamEngine(), 1, true),
                new ItemAmount(new IronWheel(), 4, true),
                new ItemAmount(new IronAxle(), 2, true)
        );
    }
}
