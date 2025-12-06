package sena.crudbasic.Dto;

public class OrderItemsDto {
    private int quantity;
    private OrderItemsIdDto orderItemsId;
    private OrdersDto orders;
    private ProductDto product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItemsIdDto getOrderItemsId() {
        return orderItemsId;
    }

    public void setOrderItemsId(OrderItemsIdDto orderItemsId) {
        this.orderItemsId = orderItemsId;
    }

    public OrdersDto getOrders() {
        return orders;
    }

    public void setOrders(OrdersDto orders) {
        this.orders = orders;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
