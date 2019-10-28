package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class DataReceiver {
    public OrderRequest retreive(){

        Customer customer = new Customer("Jan");

        Item item = new Item("Szczotka",1);

        Shop shop = new Shop("GlutenFreeShop",2);

        LocalDateTime time = LocalDateTime.of(2019,8,1,2,1,1);

        return new OrderRequest(customer,item, shop, time);
    }
}
