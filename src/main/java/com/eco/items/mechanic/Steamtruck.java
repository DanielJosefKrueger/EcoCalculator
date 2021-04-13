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
                new ItemAmount(new IronPlatte(), 12),
                new ItemAmount(new IronPipe(), 8),
                new ItemAmount(new Screw(), 24),
                new ItemAmount(new Leather(), 20),
                new ItemAmount(new Lumber(), 30),
                new ItemAmount(new SteamEngine(), 1, true),
                new ItemAmount(new IronWheel(), 4, true),
                new ItemAmount(new IronAxle(), 1, true)
        );
    }
}
