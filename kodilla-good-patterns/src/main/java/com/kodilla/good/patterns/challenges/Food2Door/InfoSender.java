package com.kodilla.good.patterns.challenges.Food2Door;

public class InfoSender {
    public void infoSender(OrderRequest orderRequest){
        System.out.println("Customer: " + orderRequest.getCustomer().getName() + " has bought " + orderRequest.getItem().getItemName() + " from shop " + orderRequest.getShop() + orderRequest.getTimeOfBuy());
    }
}
