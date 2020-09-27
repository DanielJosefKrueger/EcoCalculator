package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.SteelPipe;
import com.eco.items.electric.AdvancedCircuit;
import com.eco.items.industry.*;
import com.eco.items.util.Receipt;

public class Valve extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Valve(), 1),
                new ItemAmount(new SteelPipe(), 4),
                new ItemAmount(new SteelPlate(), 4),
                new ItemAmount(new SteelGearBox(), 1)
        );
    }

}
