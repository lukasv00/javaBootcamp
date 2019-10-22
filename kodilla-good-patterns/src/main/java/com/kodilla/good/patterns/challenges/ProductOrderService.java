package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private final Customer customer;
    private final Item item;
    private final InfoService infoService;
    private final WarehouseService warehouseService;

    public ProductOrderService(Customer customer, Item item, InfoService infoService, WarehouseService warehouseService) {
        this.customer = customer;
        this.item = item;
        this.infoService = infoService;
        this.warehouseService = warehouseService;
    }

    public OrderMakerDTO process(OrderRequest orderRequest){
        if (warehouseService.checkStatusOfItem(orderRequest)) {
            infoService.infoSender(orderRequest);
            return new OrderMakerDTO(orderRequest.getCustomer(), orderRequest.getItem(),true);
        } else {
            System.out.println("dupa");
            return new OrderMakerDTO(orderRequest.getCustomer() , orderRequest.getItem(),false);
        }

    }

    public static void main(String[] args) {

        OrderRetriever retriever = new OrderRetriever();
        OrderRequest request = retriever.retreive();

        ProductOrderService productOrderService = new ProductOrderService(request.getCustomer(), request.getItem(), new InfoService(), new WarehouseService());
        productOrderService.process(request);
    }
}
