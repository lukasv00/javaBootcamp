package com.kodilla.good.patterns.challenges.Food2Door;

public class Item {
    private final String itemName;
    private final int quantity;


    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}
