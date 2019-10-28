package com.kodilla.good.patterns.challenges.Food2Door;

import javax.sound.sampled.Line;

public class ShopsProcessor {
    private final int ShopId;
    private InfoSender infoSender;

    public ShopsProcessor(int ShopId, InfoSender infoSender) {
        this.ShopId = ShopId;
        this.infoSender = infoSender;
    }

    public OrderMakerDTO swichProcessor(OrderRequest orderRequest) {
        switch (ShopId) {
            case 1: {
                //sample method for Shop 1
                return null;
            }

            case 2: {
                infoSender.infoSender(orderRequest);
                return new OrderMakerDTO(orderRequest.getCustomer(),orderRequest.getItem(),true);
            }

            case 3: {
                //Sample method for Shop 3
                return null;
            }
        }
    }
}
