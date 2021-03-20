package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.bars.IronBar;
import com.eco.items.electric.AdvancedCircuit;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.Valve;
import com.eco.items.util.Receipt;

public class GearBox extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new GearBox(), 1),
                new ItemAmount(new IronBar(), 2),
                new ItemAmount(new IronGear(), 4)
        );
    }
}
