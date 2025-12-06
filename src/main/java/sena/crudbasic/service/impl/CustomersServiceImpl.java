package sena.crudbasic.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.crudbasic.Dto.CustomersDto;
import sena.crudbasic.mapper.CustomersMapper;
import sena.crudbasic.model.Customers;
import sena.crudbasic.repository.CustomersRepository;
import sena.crudbasic.service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService {

  @Autowired
  private CustomersRepository repo;

  @Override
  public List<CustomersDto> findAll() {
    return repo.findAll().stream().map(CustomersMapper::toDto).toList();
  }

  @Override
  public CustomersDto findById(int id) {
    Customers model = repo.findById(id).orElse(null);
    return CustomersMapper.toDto(model); 
  }

  @Override
  public List<CustomersDto> filterByName(String name) {
    return repo.findAll().stream().map(CustomersMapper::toDto).toList();
  }

  @Override
  public CustomersDto save(CustomersDto dto) {

    if (repo.existsByEmail(dto.getEmail())) {
        throw new RuntimeException("el gmail ya existe");
    }

    Customers model = CustomersMapper.toEntity(dto);

    if (model == null) {
        return null;
    }

    model.setRegisteredAt(LocalDateTime.now());

    Customers saved = repo.save(model);

    return CustomersMapper.toDto(saved);
  }

  @Override
  public CustomersDto update(int id, CustomersDto dto) {

    Customers customersDB = repo.findById(id).orElse(null);

    if (customersDB == null) {
      return null;
    }

    CustomersMapper.updateEntityFromDto(dto, customersDB);

    Customers updated = repo.save(customersDB);

    return CustomersMapper.toDto(updated);
  }

  @Override
  public boolean delete(int id) {
    if (!repo.existsById(id)) {
      return false;
    }
    repo.deleteById(id);
    return true;
  }

}
