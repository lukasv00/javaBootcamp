package com.kodilla.good.patterns.challenges.Food2Door;

public interface Shop {

    void infoSender(OrderRequest orderRequest);

    OrderMakerDTO orderMakerCreator(OrderRequest orderRequest);

    String getName();

    void processor(OrderRequest orderRequest);
}
