package sena.crudbasic.Dto;

public class UserRoleIdDto {
    private int idUser;
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

    public UserRoleIdDto(int idUser, int idRole) {
        this.idUser = idUser;
        this.idRole = idRole;
    }
}
