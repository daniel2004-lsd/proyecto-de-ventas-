package sena.crudbasic.model;

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
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orders")
    private int idOrders;

    @ManyToOne
    @JoinColumn(name = "id_customers")
    private Customers customers;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "status" , length = 50)
    private String status;

}
