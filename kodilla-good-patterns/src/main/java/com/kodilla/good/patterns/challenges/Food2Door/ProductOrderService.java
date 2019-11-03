package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderService {
    private final InfoSender infoSender;

    public ProductOrderService(InfoSender infoSender) {
        this.infoSender = infoSender;
    }


    public OrderMakerDTO process(OrderRequest orderRequest){
            infoSender.infoSender(orderRequest);
            return new OrderMakerDTO(orderRequest.getCustomer(), orderRequest.getItem(),true);
    }
}
