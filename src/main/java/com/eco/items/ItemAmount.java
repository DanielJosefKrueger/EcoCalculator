package com.eco.items;

public class ItemAmount {

    private final Item item ;
    private final int amount;
    private final boolean unaffctedByUpgrades;


    public ItemAmount(Item item, int amount) {
        this.item = item;
        this.amount = amount;
        this.unaffctedByUpgrades = false;
    }

    public ItemAmount(Item item, int amount, boolean unaffctedByUpgrades) {
        this.item = item;
        this.amount = amount;
        this.unaffctedByUpgrades = unaffctedByUpgrades;
    }


    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "ItemAmount{" +
                "item=" + item.getClass().getSimpleName() +
                ", amount=" + amount +
                '}';
    }

    public boolean isUnaffctedByUpgrades() {
        return unaffctedByUpgrades;
    }
}
