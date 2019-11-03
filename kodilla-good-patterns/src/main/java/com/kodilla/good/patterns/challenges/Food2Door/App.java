package com.kodilla.good.patterns.challenges.Food2Door;

public class App {
    public static void main(String[] args) {
        DataReceiver receiver = new DataReceiver();
        OrderRequest request = receiver.retreive();

        ExtraFoodShop extraFoodShopProcessor = new ExtraFoodShop();
        extraFoodShopProcessor.processor(request);
    }
}
