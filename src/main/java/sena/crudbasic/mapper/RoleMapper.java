package sena.crudbasic.mapper;


import sena.crudbasic.Dto.RoleDto;
import sena.crudbasic.model.Role;

public class RoleMapper {
 // dto a entity
    public static Role toEntity(RoleDto dto){
        if (dto==null) {
                return null;
        }
        Role role = new Role();
        role.setName(dto.getName());
        role.setDescripcion(dto.getDescripcion());
        role.setIdRole(dto.getIdRole());

        return role;
        
    }

// entity a dto
    public static RoleDto toDto(Role role){
        if (role==null) {
            return null;
        }

        RoleDto dto = new RoleDto();
        dto.setName(role.getName());
        dto.setIdRole(role.getIdRole());
        dto.setDescripcion(role.getDescripcion());

        return dto;
    }

    public static void updateEntityFromDto(RoleDto dto, Role entity) {
    if (dto.getName() != null) entity.setName(dto.getName());
    if(dto.getDescripcion() !=null) entity.setDescripcion(dto.getDescripcion());

}
}
