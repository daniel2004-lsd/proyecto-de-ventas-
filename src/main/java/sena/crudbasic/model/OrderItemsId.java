package sena.crudbasic.model;

import java.io.Serializable;

import jakarta.persistence.Column;

public class OrderItemsId implements Serializable {

    @Column(name = "id_order")
    private int idOrder;


    @Column(name = "id_product")
    private int idProduct;

    


    public OrderItemsId(int idOrder, int idProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
    }


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


}
