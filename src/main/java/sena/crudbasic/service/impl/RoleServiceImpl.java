package sena.crudbasic.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.crudbasic.Dto.RoleDto;

import sena.crudbasic.mapper.RoleMapper;
import sena.crudbasic.model.Role;
import sena.crudbasic.repository.RoleRepository;
import sena.crudbasic.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repo;

    @Override
    public List<RoleDto> findAll() {
        return repo.findAll().stream().map(RoleMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public RoleDto findById(int id) {
        Role role = repo.findById(id).orElseThrow(() -> new RuntimeException("rol no existe"));
        return RoleMapper.toDto(role);
    }

    @Override
    public List<RoleDto> filterByName(String name) {
        return repo.filterByName(name).stream().map(RoleMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public RoleDto save(RoleDto dto) {
       Role role = new Role();
       role.setName(dto.getName());
       role.setDescripcion(dto.getDescripcion());

       Role saved = repo.save(role);
       return RoleMapper.toDto(saved);
       
    }


    @Override
    public RoleDto update(int id, RoleDto dto) {
        Role existing = repo.findById(id).orElseThrow(() -> new RuntimeException("rol no existe"));
        existing.setName(dto.getName());
        existing.setDescripcion(dto.getDescripcion());

        Role saved = repo.save(existing);
        return RoleMapper.toDto(saved);

    }

        @Override
        public boolean delete(int id){
          if (!repo.existsById(id)) {
        return false;
    }
        repo.deleteById(id);
        return true;

    }
}