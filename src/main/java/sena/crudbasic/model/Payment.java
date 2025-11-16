package sena.crudbasic.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payments")
    private int idPayment;

    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Orders orders;

    @Column(name = "payment_date")
    private Timestamp payment_date;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "method")
    private String method;


}
