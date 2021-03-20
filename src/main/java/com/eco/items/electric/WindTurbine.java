package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.mechanic.GearBox;
import com.eco.items.util.Receipt;

public class WindTurbine extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new WindTurbine(), 1),
                new ItemAmount(new SteelBar(), 8),
                new ItemAmount(new GearBox(), 4),
                new ItemAmount(new AdvancedCircuit(), 4)
        );
    }


}
