package sena.crudbasic.Dto;

public class OrderItemsIdDto {
    private int idOrder;
    private int idProduct;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public OrderItemsIdDto(int idOrder, int idProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
    }
}
