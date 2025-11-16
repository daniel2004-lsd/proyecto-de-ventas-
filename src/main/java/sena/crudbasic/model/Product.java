package sena.crudbasic.model;



import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producs")
    private int idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;   
    
    @Column(name = "stock")
    private int stock;
}