package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.Servo;
import com.eco.items.util.Receipt;

public class SolarGenerator extends Item {


    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new SolarGenerator(), 1),
                new ItemAmount(new BasicCircuit(), 8),
                new ItemAmount(new Servo(), 8),
                new ItemAmount(new SteelBar(), 12)
        );
    }


}
