package sena.crudbasic.model;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToMany(mappedBy = "user")
    private List<UserRole> roles;

}
