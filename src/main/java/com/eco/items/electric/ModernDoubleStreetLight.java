package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.industry.SteelPlate;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class ModernDoubleStreetLight extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ModernDoubleStreetLight(), 1),
                new ItemAmount(new SteelPlate(), 8),
                new ItemAmount(new Plastic(), 5),
                new ItemAmount(new CopperWiring(), 10),
                new ItemAmount(new Lightbulb(), 2, true)
        );
    }
}
