package sena.crudbasic.Dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PaymentDto {
    private int idPayment;
    private OrdersDto orders;
    private Timestamp payment_date;
    private BigDecimal amount;
    private String method;

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public OrdersDto getOrders() {
        return orders;
    }

    public void setOrders(OrdersDto orders) {
        this.orders = orders;
    }

    public Timestamp getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Timestamp payment_date) {
        this.payment_date = payment_date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
