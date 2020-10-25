package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.Radiator;
import com.eco.items.industry.SteelPlate;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class Refrigarator extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Refrigarator(), 1),
                new ItemAmount(new SteelBar(), 16),
                new ItemAmount(new BasicCircuit(), 8),
                new ItemAmount(new Radiator(), 3)
        );
    }
}
