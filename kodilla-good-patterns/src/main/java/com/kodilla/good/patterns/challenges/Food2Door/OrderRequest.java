package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Customer customer;
    private final LocalDateTime timeOfBuy;
    private final Item item;
    private final Shop shop;

    public OrderRequest(Customer customer, Item item, Shop shop, LocalDateTime timeOfBuy) {
        this.customer = customer;
        this.timeOfBuy = timeOfBuy;
        this.item = item;
        this.shop = shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getTimeOfBuy() {
        return timeOfBuy;
    }

    public Item getItem() {
        return item;
    }

    public Shop getShop() {
        return shop;
    }
}
