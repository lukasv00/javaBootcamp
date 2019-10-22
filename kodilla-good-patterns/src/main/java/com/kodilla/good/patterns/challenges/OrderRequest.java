package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Customer customer;
    private final LocalDateTime timeOfBuy;
    private final Item item;

    public OrderRequest(Customer customer, Item item, LocalDateTime timeOfBuy) {
        this.customer = customer;
        this.timeOfBuy = timeOfBuy;
        this.item = item;
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
}

