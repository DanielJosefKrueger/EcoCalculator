package com.eco.items.upgrade;

import com.eco.items.Cement;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.ElectroMotor;
import com.eco.items.industry.Servo;
import com.eco.items.industry.SteelGear;
import com.eco.items.industry.SteelPlate;
import com.eco.items.util.Receipt;

public class ModernUpgrade2 extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new ModernUpgrade2(), 1),
                new ItemAmount(new ModernUpgrade1(), 1, true),
                new ItemAmount(new SteelPlate(), 16),
                new ItemAmount(new SteelGear(), 10)
        );
    }

}
