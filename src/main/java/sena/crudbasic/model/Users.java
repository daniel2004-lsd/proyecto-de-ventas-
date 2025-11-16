package sena.crudbasic.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "user_name", length = 50)
    private String userName;

    @Column (name = "email", length  = 50)
    private String email;

    @Column (name = "password", length = 50)
    private String password;

    @Column (name = "created_at")
    private Timestamp created_at;
    
    @Column (name = "active")
    private boolean active;

}
