    package sena.crudbasic.model;

    import java.sql.Timestamp;
import java.time.LocalDateTime;

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
    private LocalDateTime registeredAt;


    public int getIdCusomers() {
        return idCusomers;
    }


    public void setIdCusomers(int idCusomers) {
        this.idCusomers = idCusomers;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }


    public void setRegisteredAt( LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }


    public Customers(int idCusomers, String firstName, String lastName, String phone, String email,
            LocalDateTime registeredAt) {
        this.idCusomers = idCusomers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.registeredAt = registeredAt;
    }
    public Customers(){
        
    }



    }
