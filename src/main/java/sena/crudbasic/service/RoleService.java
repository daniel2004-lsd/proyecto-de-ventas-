package sena.crudbasic.service;

import java.util.List;


import sena.crudbasic.Dto.RoleDto;

public interface RoleService {

        List<RoleDto> findAll();

        RoleDto findById(int id);

        List<RoleDto> filterByName(String name);

        RoleDto save(RoleDto dto);

        boolean delete(int id);
        
        RoleDto update(int id, RoleDto dto);
}
