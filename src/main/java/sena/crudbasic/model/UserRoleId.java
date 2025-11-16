package sena.crudbasic.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;



@Embeddable
public class UserRoleId implements Serializable {
    
  @Column(name ="id_user")
  private int idUser;

  @Column(name = "id_role")
  private int idRole;

  

  public int getIdUser() {
    return idUser;
}



  public void setIdUser(int idUser) {
    this.idUser = idUser;
  }



  public int getIdRole() {
    return idRole;
  }



  public void setIdRole(int idRole) {
    this.idRole = idRole;
  }



  public UserRoleId(int idUser, int idRole) {
    this.idUser = idUser;
    this.idRole = idRole;
  }
    

}
