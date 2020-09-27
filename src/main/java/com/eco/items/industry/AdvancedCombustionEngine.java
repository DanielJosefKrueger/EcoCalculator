package com.eco.items.industry;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.electric.AdvancedCircuit;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.Valve;
import com.eco.items.util.Receipt;

public class AdvancedCombustionEngine extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new AdvancedCombustionEngine(), 1),
                new ItemAmount(new SteelPlate(), 16),
                new ItemAmount(new Rivet(), 12),
                new ItemAmount(new IronPiston(), 6),
                new ItemAmount(new Valve(), 6),
                new ItemAmount(new Servo(), 6),
                new ItemAmount(new AdvancedCircuit(), 6),
                new ItemAmount(new Radiator(), 3)
                );
    }
}
