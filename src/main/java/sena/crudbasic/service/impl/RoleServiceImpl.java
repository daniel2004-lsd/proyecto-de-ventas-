package sena.crudbasic.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.crudbasic.Dto.RoleDto;
import sena.crudbasic.mapper.ProductMapper;
import sena.crudbasic.mapper.RoleMapper;
import sena.crudbasic.model.Role;
import sena.crudbasic.repository.RoleRepository;
import sena.crudbasic.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repo; 

    @Override
    public List<RoleDto>findAll() {
return repo.findAll().stream().map(RoleMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public RoleDto findById(int id) {
     Role role = repo.findById(id).orElse(null);
     return RoleMapper.toDto(role);
    }

    @Override
    public List<RoleDto> filterByName(String name) {
        return repo.findAll().stream().map(RoleMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public RoleDto save(RoleDto dto) {
        if (dto==null) {
            throw new IllegalArgumentException("El DTO no puede ser null");
        }
        Role role = RoleMapper.toEntity(dto);
        if (role== null) {
            throw new IllegalStateException("No se pudo mapear a entidad");
        }

        Role saved = repo.save(role);
        
        return RoleMapper.toDto(saved);
    }

    @Override
    public boolean delete(int id) {
      Role role = repo.findById(id).orElse(null);
      if (role==null) {
        return false;
      }

      repo.delete(role);
      return true;
    }

    @Override
    public RoleDto update(int id, RoleDto dto) {
    Role existing = repo.findById(id).orElse(null);
    if (existing == null){
        throw new IllegalStateException("El producto con id " + id + " no existe");

    }
    Role model = RoleMapper.toEntity(dto);
    if (model==null) {
                throw new IllegalStateException("No se pudo mapear a entidad");
    }

    Role saved = repo.save(model);
     return RoleMapper.toDto(saved);
    


    
    }

}
