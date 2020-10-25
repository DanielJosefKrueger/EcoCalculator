package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.SteelPipe;
import com.eco.items.industry.SteelPlate;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class ModernStreetLight extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ModernStreetLight(), 1),
                new ItemAmount(new SteelPlate(), 6),
                new ItemAmount(new Plastic(), 4),
                new ItemAmount(new CopperWiring(), 6),
                new ItemAmount(new Lightbulb(), 1, true)
        );
    }
}
