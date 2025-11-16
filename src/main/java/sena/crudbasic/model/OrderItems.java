package sena.crudbasic.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItems {
    private int quantity;


    @EmbeddedId
    private OrderItemsId orderItemsId;

    @ManyToOne
    @MapsId("idOrder")
    @JoinColumn(name= "id_order") 
    private Orders orders;


    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_product")
    private Product product;


    public OrderItemsId getOrderItemsId() {
        return orderItemsId;
    }


    public void setOrderItemsId(OrderItemsId orderItemsId) {
        this.orderItemsId = orderItemsId;
    }


    public Orders getOrders() {
        return orders;
    }


    public void setOrders(Orders orders) {
        this.orders = orders;
    }


    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity(){
        
        return quantity;

    }
      public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}