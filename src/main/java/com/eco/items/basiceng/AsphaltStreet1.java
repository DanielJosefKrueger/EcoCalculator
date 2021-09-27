package com.eco.items.basiceng;

import com.eco.items.*;
import com.eco.items.bars.IronBar;
import com.eco.items.util.Receipt;

public class AsphaltStreet1 extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new AsphaltStreet1(), 2),
                new ItemAmount(new Crushed(), 5),
                new ItemAmount(new Cement(), 1),
                new ItemAmount(new Sand(), 2)
        );
    }
}
