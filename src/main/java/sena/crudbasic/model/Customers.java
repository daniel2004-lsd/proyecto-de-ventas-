package sena.crudbasic.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_customers")
private int idCusomers;


@Column(name = "first_name", length = 56)
private String firstName ;


@Column(name = "last_name", length = 56)
private String lastName;


@Column(name = "phone", length = 56)
private String  phone;


@Column(name ="email")
private String email;


@Column(name = "registered_at")
private Timestamp registeredAt;



}
