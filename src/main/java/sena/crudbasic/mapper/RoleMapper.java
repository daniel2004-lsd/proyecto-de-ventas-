package sena.crudbasic.mapper;


import sena.crudbasic.Dto.ProductDto;
import sena.crudbasic.Dto.RoleDto;
import sena.crudbasic.model.Product;
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
        role.setIdRole(dto.getId());

        return role;
        
    }

// entity a dto
    public static Role toDto(Role role){
        if (role==null) {
            return null;
        }

        RoleDto dto = new RoleDto();
        dto.setName(role.getName();)

        return dto;
    }

    public static void updateEntityFromDto(ProductDto dto, Product entity) {
    if (dto.getName() != null) entity.setName(dto.getName());
    if (dto.getPrice() != null) entity.setPrice(dto.getPrice());

}
}
