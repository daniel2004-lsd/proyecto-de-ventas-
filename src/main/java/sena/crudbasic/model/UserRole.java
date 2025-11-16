package sena.crudbasic.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserRole {

    @EmbeddedId
    private UserRoleId id;

    @ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "id_user")
    private Users user; 

    @ManyToOne
    @MapsId("idRole")
    @JoinColumn(name = "id_role")
    private Role role;
}
