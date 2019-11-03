package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {
    private final String name = "Extra food shop";


    @Override
    public void infoSender(OrderRequest orderRequest) {
        InfoSender infoSender = new InfoSender();
        infoSender.infoSender(orderRequest);
    }

    @Override
    public OrderMakerDTO orderMakerCreator(OrderRequest orderRequest) {
        return new OrderMakerDTO(orderRequest.getCustomer(), orderRequest.getItem(), true);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void processor(OrderRequest orderRequest) {
        infoSender(orderRequest);
        orderMakerCreator(orderRequest);
    }
}