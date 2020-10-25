package com.eco.items.electric;

import com.eco.items.Glass;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.industry.SteelPlate;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class Lightbulb extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new Lightbulb(), 1),
                new ItemAmount(new Glass(), 2),
                new ItemAmount(new CopperWiring(), 6)
        );
    }
}
