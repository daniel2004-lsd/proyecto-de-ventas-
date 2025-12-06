package sena.crudbasic.mapper;

import sena.crudbasic.Dto.CustomersDto;
import sena.crudbasic.model.Customers;

public class CustomersMapper {

    // aca convertimos lo que envia el front a una entidad en la bases de datos
    public static Customers toEntity(CustomersDto dto) {
       
        Customers model = new Customers();
        model.setEmail(dto.getEmail());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setPhone(dto.getPhone());

        return model;
    }

    // aca convetimos una entidad a dto para enviar la respuesta al frond
    public static CustomersDto toDto(Customers model) {
        if (model == null) {
            return null;
        }
        CustomersDto dto = new CustomersDto();

        dto.setFirstName(model.getFirstName());
        dto.setLastName(model.getLastName());
        dto.setEmail(model.getEmail());
        dto.setPhone(model.getPhone());

        return dto;
    }

    public static void updateEntityFromDto(CustomersDto dto, Customers entity) {
        if (dto.getFirstName() != null)
            entity.setFirstName(dto.getFirstName());
        if (dto.getLastName() != null)
            entity.setLastName(dto.getLastName());
        if (dto.getEmail() != null)
            entity.setEmail(dto.getEmail());
        if (dto.getPhone() != null)
            entity.setPhone(dto.getPhone());
    }

}
