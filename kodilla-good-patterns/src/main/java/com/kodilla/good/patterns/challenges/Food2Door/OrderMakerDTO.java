package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderMakerDTO {
    private final Customer customer;
    private final Item item;
    private boolean bought;

    public OrderMakerDTO(Customer customer, Item item, boolean bought) {
        this.customer = customer;
        this.item = item;
        this.bought = bought;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }
}
