package com.eco.items.mechanic.machines;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.IronBar;
import com.eco.items.mechanic.IronGear;
import com.eco.items.mechanic.PortableSteamEngine;
import com.eco.items.mechanic.Screw;
import com.eco.items.util.Receipt;

public class ScrewPress extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new ScrewPress(), 1),
                new ItemAmount(new IronBar(), 25)
        );
    }
}
