package com.eco.items.electric;

import com.eco.items.Cement;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.Servo;
import com.eco.items.util.Receipt;

public class RoboticAssemblyLine extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new RoboticAssemblyLine(), 1),
                new ItemAmount(new Cement(), 30),
                new ItemAmount(new ElectroMotor(), 5),
                new ItemAmount(new Servo(), 12),
                new ItemAmount(new SteelBar(), 30)
        );
    }
}

