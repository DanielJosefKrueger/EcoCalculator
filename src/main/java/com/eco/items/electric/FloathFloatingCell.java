package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.SteelPipe;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.SteelPlate;
import com.eco.items.util.Receipt;

public class FloathFloatingCell extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new FloathFloatingCell(), 1),
                new ItemAmount(new SteelPlate(), 15),
                new ItemAmount(new SteelPipe(), 20),
                new ItemAmount(new AdvancedCircuit(), 10),
                new ItemAmount(new ElectroMotor(), 1, true)
        );
    }
}
