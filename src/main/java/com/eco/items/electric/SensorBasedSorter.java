package com.eco.items.electric;

import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.Rivet;
import com.eco.items.bars.SteelBar;
import com.eco.items.industry.Servo;
import com.eco.items.industry.SteelGearBox;
import com.eco.items.industry.SteelPlate;
import com.eco.items.util.Receipt;

public class SensorBasedSorter extends Item {

    public Receipt getReceipt() {
        return new Receipt(new ItemAmount(new SolarGenerator(), 1),
                new ItemAmount(new SteelPlate(), 10),
                new ItemAmount(new SteelGearBox(), 5),
                new ItemAmount(new Rivet(), 16),
                new ItemAmount(new AdvancedCircuit(), 5),
                new ItemAmount(new BasicCircuit(), 5),
                new ItemAmount(new ElectroMotor(), 1, true)
        );
    }
}
