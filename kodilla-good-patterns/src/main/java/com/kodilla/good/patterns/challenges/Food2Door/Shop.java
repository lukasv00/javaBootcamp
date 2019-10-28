package com.kodilla.good.patterns.challenges.Food2Door;

public class Shop {
    private final String shopName;
    private final int shopId;

    public Shop(String shopName, int shopId) {
        this.shopName = shopName;
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public int getShopId() {
        return shopId;
    }
}
