package com.eco.items.industry;

import com.eco.items.CelluloseFiber;
import com.eco.items.Item;
import com.eco.items.ItemAmount;
import com.eco.items.mechanic.GearBox;
import com.eco.items.util.Receipt;

public class
SkidSteer extends Item {



      public Receipt getReceipt(){
          return new Receipt(new ItemAmount(new SkidSteer(), 1),
                  new ItemAmount(new GearBox(), 4),
                  new ItemAmount(new CelluloseFiber(), 8),
                  new ItemAmount(new SteelPlate(), 16),
                  new ItemAmount(new AdvancedCombustionEngine(), 1, true),
                  new ItemAmount(new RubberWheel(), 4, true),
                  new ItemAmount(new SteelAxle(), 1, true),
                  new ItemAmount(new Radiator(), 2, true)
                  );
      }




}
