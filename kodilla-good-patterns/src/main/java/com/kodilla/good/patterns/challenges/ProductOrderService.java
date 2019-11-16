package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final InfoService infoService;
    private final WarehouseService warehouseService;

    public ProductOrderService(InfoService infoService, WarehouseService warehouseService) {
        this.infoService = infoService;
        this.warehouseService = warehouseService;
    }

    public OrderMakerDTO process(OrderRequest orderRequest) {
        if (warehouseService.checkStatusOfItem(orderRequest)) {
            infoService.infoSender(orderRequest);
            return new OrderMakerDTO(orderRequest.getCustomer(), orderRequest.getItem(), true);
        } else {
            return new OrderMakerDTO(orderRequest.getCustomer(), orderRequest.getItem(), false);
        }

    }

    public static void main(String[] args) {

        OrderRetriever retriever = new OrderRetriever();
        OrderRequest request = retriever.retreive();

        ProductOrderService productOrderService = new ProductOrderService(new InfoService(), new WarehouseService());
        productOrderService.process(request);
    }
}
