package com.eco;

import com.eco.items.*;
import com.eco.items.bars.CopperBar;
import com.eco.items.bars.GoldBar;
import com.eco.items.bars.IronBar;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.FloathFloatingCell;
import com.eco.items.electric.SolarGenerator;
import com.eco.items.electric.WindTurbine;
import com.eco.items.industry.CombustionEngine;
import com.eco.items.industry.CombustionGenerator;
import com.eco.items.industry.GearBox;
import com.eco.items.industry.SkidSteer;
import com.eco.items.mechanic.IronPiston;
import com.eco.items.mechanic.IronPlatte;
import com.eco.items.oil.Epoxy;
import com.eco.items.oil.Plastic;
import com.eco.items.oil.Rubber;
import com.eco.items.util.Receipt;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<Class, Double> itemPriceMap = new HashMap<>();
    private HashMap<Class, Integer> toBuy = new HashMap<>();

    private static final Double FACTOR_UPGRADE = 0.9;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.findNeededComponentsAndPrices(new ItemAmount(new WindTurbine(), 1));
        calculator.summarize();
    }


    Calculator(){
        itemPriceMap.put(CopperBar.class, 3.0);
        itemPriceMap.put(GoldBar.class, 5.0);
        itemPriceMap.put(IronBar.class, 2.0);
        itemPriceMap.put(SteelBar.class, 4.0);
        itemPriceMap.put(GearBox.class, 10.0);
        itemPriceMap.put(IronPiston.class, 5.0);
        itemPriceMap.put(IronPlatte.class, 2.5);
        itemPriceMap.put(CelluloseFiber.class, 1.4);
        itemPriceMap.put(Rivet.class, 1.0);
        itemPriceMap.put(CombustionEngine.class, 70.0);

        itemPriceMap.put(SteelPipe.class, 2.0);
        itemPriceMap.put(Rubber.class, 3.5);
        itemPriceMap.put(Epoxy.class, 3.5);
        itemPriceMap.put(Plastic.class, 4.0);

        itemPriceMap.put(Glass.class, 1.5);

    }



    public double findNeededComponentsAndPrices(ItemAmount itemAmount){
        Class<? extends Item> itemClass = itemAmount.getItem().getClass();
        if(itemPriceMap.containsKey(itemClass)){
            toBuy.put(itemClass, toBuy.getOrDefault(itemClass, 0) + itemAmount.getAmount());
           return itemPriceMap.get(itemClass) * itemAmount.getAmount();
       }

        double price =0;
        Receipt receipt = itemAmount.getItem().getReceipt();
        if(receipt ==null){
            throw new RuntimeException("Item " + itemAmount.getItem() + " has no price and no receipt");
        }
        ItemAmount[] ingredients = receipt.getIngredients();
        for (ItemAmount ingredient : ingredients) {
            int needed = itemAmount.getAmount() ;
            int producedInOneTurn = receipt.getResult().getAmount();
            int times = needed / producedInOneTurn;
            if(times == 0){
                times =1; // at least once
            }

            int amountIngredient = roundup(times * ingredient.getAmount() * (ingredient.isUnaffctedByUpgrades()?1:FACTOR_UPGRADE));
            System.out.println(itemAmount.getAmount()+ " -times the Receipt " + receipt.toString() + " needs " +  amountIngredient + " of item " + ingredient.getItem());
            price += findNeededComponentsAndPrices(new ItemAmount(ingredient.getItem(), amountIngredient));

        }
        System.out.println("Item " + itemAmount.getItem() + " in an amount of " + itemAmount.getAmount() + " cost " + price + ". (per Item:" + price/ itemAmount.getAmount() + ")");
        return price;
    }

    private int roundup(double d){
        if((int)d  == d  ){
            return (int)d  ;
        }else{
            return (int)d +1 ;
        }
    }


    public void summarize(){
        Double completePrice = 0.0;
        for (Map.Entry<Class, Integer> entry : toBuy.entrySet()) {
            Double price = itemPriceMap.get(entry.getKey()) * entry.getValue();
            completePrice += price;
            System.out.println(entry.getKey().getSimpleName() + ":\t" + entry.getValue() + " Preis: " + price + "/Einzelpreis: " + itemPriceMap.get(entry.getKey()));
        }
        System.out.println(completePrice);
    }










}
