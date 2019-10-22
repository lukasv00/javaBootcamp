package com.kodilla.good.patterns.challenges;

public class InfoService {

    public void infoSender(OrderRequest orderRequest){
        System.out.println("Customer: " + orderRequest.getCustomer().getName() + " has bought " + orderRequest.getItem().getItemName() + " then " + orderRequest.getTimeOfBuy());
    }

}
