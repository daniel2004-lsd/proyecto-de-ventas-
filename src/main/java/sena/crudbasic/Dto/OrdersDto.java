package sena.crudbasic.Dto;

import java.sql.Timestamp;

public class OrdersDto {
    private int idOrders;
    private CustomersDto customers;
    private Timestamp orderDate;
    private String status;

    public int getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(int idOrders) {
        this.idOrders = idOrders;
    }

    public CustomersDto getCustomers() {
        return customers;
    }

    public void setCustomers(CustomersDto customers) {
        this.customers = customers;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
