package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.industry.AdvancedCombustionEngine;
import com.eco.items.industry.Radiator;
import com.eco.items.industry.Servo;
import com.eco.items.industry.SteelPlate;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.Valve;
import com.eco.items.util.Receipt;

public class AdvancedCircuit extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new AdvancedCircuit(), 1),
                new ItemAmount(new CopperWiring(), 4),
                new ItemAmount(new GoldWiring(), 4),
                new ItemAmount(new GoldFlakes(), 10),
                new ItemAmount(new Substrate(), 2)
        );
    }



}
