package com.eco.items.basiceng;

import com.eco.items.*;
import com.eco.items.util.Receipt;

public class AsphaltStreet2 extends Item {

    public Receipt getReceipt(){
        return new Receipt(new ItemAmount(new AsphaltStreet2(), 10),
                new ItemAmount(new Crushed(), 24),
                new ItemAmount(new Cement(), 5),
                new ItemAmount(new Sand(), 10)
        );
    }
}
