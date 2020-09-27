package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.util.Receipt;

public class BasicCircuit extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new BasicCircuit(), 1),
                new ItemAmount(new CopperWiring(), 4),
                new ItemAmount(new Substrate(), 2),
                new ItemAmount(new GoldFlakes(), 10)
        );
    }

}
