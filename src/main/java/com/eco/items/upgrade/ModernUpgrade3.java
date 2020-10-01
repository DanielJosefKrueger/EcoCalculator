package com.eco.items.upgrade;

import com.eco.items.Cement;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.BasicCircuit;
import com.eco.items.electric.ElectroMotor;
import com.eco.items.electric.RoboticAssemblyLine;
import com.eco.items.industry.Servo;
import com.eco.items.oil.Epoxy;
import com.eco.items.oil.Plastic;
import com.eco.items.util.Receipt;

public class ModernUpgrade3 extends Item {
     public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ModernUpgrade3(), 1),
                new ItemAmount(new ModernUpgrade2(), 1, true),
                new ItemAmount(new Plastic(), 15),
                new ItemAmount(new Epoxy(), 10),
                new ItemAmount(new BasicCircuit(), 8)
        );
    }

}
