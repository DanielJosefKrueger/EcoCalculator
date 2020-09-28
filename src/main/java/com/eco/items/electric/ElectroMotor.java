package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.util.Receipt;

public class ElectroMotor extends Item {



    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ElectroMotor(), 1),
                new ItemAmount(new BasicCircuit(), 4),
                new ItemAmount(new CopperWiring(), 10),
                new ItemAmount(new SteelBar(), 8)
        );
    }

}
