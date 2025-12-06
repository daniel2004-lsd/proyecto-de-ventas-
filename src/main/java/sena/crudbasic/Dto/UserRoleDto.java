package sena.crudbasic.Dto;

public class UserRoleDto {
    private UserRoleIdDto id;
    private UsersDto user;
    private RoleDto role;

    public UserRoleIdDto getId() {
        return id;
    }

    public void setId(UserRoleIdDto id) {
        this.id = id;
    }

    public UsersDto getUser() {
        return user;
    }

    public void setUser(UsersDto user) {
        this.user = user;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }
}
