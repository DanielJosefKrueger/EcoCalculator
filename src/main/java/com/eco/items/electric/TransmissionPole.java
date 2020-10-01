package com.eco.items.electric;

import com.eco.items.Cement;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Lumber;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.Servo;
import com.eco.items.util.Receipt;

public class TransmissionPole extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new TransmissionPole(), 1),
                new ItemAmount(new SteelBar(), 8),
                new ItemAmount(new CopperWiring(), 14),
                new ItemAmount(new Lumber(), 10)
        );
    }
}

