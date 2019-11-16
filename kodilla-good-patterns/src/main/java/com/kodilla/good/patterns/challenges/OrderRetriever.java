package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRetriever {

    public OrderRequest retreive() {

        Customer customer = new Customer("Jan");

        Item item = new Item("Szczotka", 1);

        LocalDateTime time = LocalDateTime.of(2019, 8, 1, 2, 1, 1);

        return new OrderRequest(customer, item, time);
    }
}
