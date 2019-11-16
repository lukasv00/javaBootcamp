package com.kodilla.good.patterns.challenges;

public class WarehouseService {
    private int ItemQuantity = 10;

    public boolean checkStatusOfItem(OrderRequest orderRequest) {
        if (ItemQuantity < orderRequest.getItem().getQuantity()) {
            return false;
        } else {
            removeItemAfterBuy(orderRequest);
            return true;
        }
    }

    public void removeItemAfterBuy(OrderRequest orderRequest) {
        ItemQuantity = ItemQuantity - orderRequest.getItem().getQuantity();
    }

}
