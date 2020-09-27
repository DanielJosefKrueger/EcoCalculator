package com.eco.items.industry;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.AdvancedCircuit;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.Valve;
import com.eco.items.util.Receipt;

public class SteelPlate extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new SteelPlate(), 1),
                new ItemAmount(new SteelBar(), 3));
    }
}
