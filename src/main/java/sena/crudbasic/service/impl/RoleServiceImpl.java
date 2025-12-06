package sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.crudbasic.Dto.RoleDto;
import sena.crudbasic.repository.RoleRepository;
import sena.crudbasic.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repo; 

    @Override
    public List<RoleDto> findAll() {
    return repo.findAll().stream().map(.)
    }

    @Override
    public RoleDto findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<RoleDto> filterByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByName'");
    }

    @Override
    public RoleDto save(RoleDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public RoleDto update(int id, RoleDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
