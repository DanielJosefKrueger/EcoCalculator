package com.eco;

import com.eco.graph.GraphUtil;
import com.eco.items.*;
import com.eco.items.bars.CopperBar;
import com.eco.items.bars.GoldBar;
import com.eco.items.bars.IronBar;
import com.eco.items.bars.SteelBar;
import com.eco.items.electric.*;
import com.eco.items.industry.*;
import com.eco.items.mechanic.*;
import com.eco.items.misc.Board;
import com.eco.items.misc.Cloth;
import com.eco.items.misc.Leather;
import com.eco.items.oil.Epoxy;
import com.eco.items.oil.Plastic;
import com.eco.items.oil.Rubber;
import com.eco.items.smithing.BlastFurnance;
import com.eco.items.smithing.IronPipe;
import com.eco.items.stone.Brick;
import com.eco.items.stone.ReinforcedConcrete;
import com.eco.items.upgrade.ModernUpgrade1;
import com.eco.items.upgrade.ModernUpgrade2;
import com.eco.items.upgrade.ModernUpgrade3;
import com.eco.items.util.Receipt;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<Class, Double> itemPriceMap = new HashMap<>();
    private HashMap<Class, Integer> toBuy = new HashMap<>();
    private GraphUtil graphUtil;

    private static final Double FACTOR_UPGRADE = 0.6;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.findNeededComponentsAndPrices(new ItemAmount(new BlastFurnance(), 1), null);
        calculator.summarize();
    }


    Calculator(){
        itemPriceMap.put(CopperBar.class, 3.5);
        itemPriceMap.put(GoldBar.class, 9.0);
        itemPriceMap.put(IronBar.class, 6.0);
        itemPriceMap.put(SteelBar.class, 4.25);
        //   itemPriceMap.put(GearBox.class, 6.5);
        itemPriceMap.put(Brick.class, 1.5);
        itemPriceMap.put(GearBox.class, 20.0);
        itemPriceMap.put(IronPipe.class, 12.0);
      //  itemPriceMap.put(IronPiston.class, 5.0);
      //  itemPriceMap.put(IronPlatte.class, 2.5);
        itemPriceMap.put(CelluloseFiber.class, 1.4);
        itemPriceMap.put(Rivet.class, 1.0);
        itemPriceMap.put(Cement.class, 1.5);
        //   itemPriceMap.put(CombustionEngine.class, 50.0);
        itemPriceMap.put(SteelPipe.class, 4.5);
        itemPriceMap.put(Rubber.class, 4.0);
        itemPriceMap.put(Epoxy.class, 4.0);
        itemPriceMap.put(Plastic.class, 4.0);
        itemPriceMap.put(Glass.class, 3.00);
        itemPriceMap.put(ModernUpgrade1.class, 300.0);
        itemPriceMap.put(Lumber.class, 6.0);
        itemPriceMap.put(HeatSink.class, 16.0);
        itemPriceMap.put(SteelPlate.class, 7.2);
        itemPriceMap.put(ReinforcedConcrete.class, 7.2);
        itemPriceMap.put(Leather.class, 0.5);
        itemPriceMap.put(Cloth.class, 1.0);
        itemPriceMap.put(Board.class, 1.0);

        graphUtil = new GraphUtil();

    }



    public double findNeededComponentsAndPrices(ItemAmount itemAmount, String originNode){
        Class<? extends Item> itemClass = itemAmount.getItem().getClass();
        String thisNodeId;
        if(originNode==null){
            thisNodeId = itemAmount.toString();
            graphUtil.start(itemAmount.toString(), itemAmount.toString());
        }else{
            thisNodeId = originNode + "_" + itemAmount.toString();
            graphUtil.addNode(thisNodeId, originNode, itemAmount.toString());
        }
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
            price += findNeededComponentsAndPrices(new ItemAmount(ingredient.getItem(), amountIngredient), thisNodeId);

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
            System.out.println(entry.getKey().getSimpleName() + ":\t" + entry.getValue() + " Preis: " + price + "/Einzelpreis: " + itemPriceMap.get(entry.getKey())+"; ");
        }
        System.out.println(completePrice);
        graphUtil.display();
    }










}
