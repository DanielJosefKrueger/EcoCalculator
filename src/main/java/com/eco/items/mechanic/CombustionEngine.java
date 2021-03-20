package com.eco.items.mechanic;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.util.Receipt;

public class CombustionEngine extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new CombustionEngine(), 1),
                new ItemAmount(new IronPiston(), 6),
                new ItemAmount(new GearBox(), 4),
                new ItemAmount(new IronPlatte(), 12),
                new ItemAmount(new Rivet(), 8)
        );
    }
}
