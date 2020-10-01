package com.eco.items.industry;

import com.eco.items.CelluloseFiber;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.ElectroMotor;
import com.eco.items.oil.Rubber;
import com.eco.items.util.Receipt;

public class JawCrusher extends Item {
    @Override
    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new JawCrusher(), 1),
                new ItemAmount(new SteelBar(), 25),
                new ItemAmount(new Rubber(), 25),
                new ItemAmount(new SteelGear(), 20),
                new ItemAmount(new ElectroMotor(), 2, true)

        );
    }
}
