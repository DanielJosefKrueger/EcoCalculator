package com.eco.items.mechanic.machines;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronGear;
import com.eco.items.mechanic.PortableSteamEngine;
import com.eco.items.mechanic.Screw;
import com.eco.items.util.Receipt;

public class AssemblyLine extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new AssemblyLine(), 1),
                new ItemAmount(new Screw(), 8),
                new ItemAmount(new IronBar(), 8),
                new ItemAmount(new IronGear(), 8),
                new ItemAmount(new PortableSteamEngine(), 1, true)
        );
    }
}
