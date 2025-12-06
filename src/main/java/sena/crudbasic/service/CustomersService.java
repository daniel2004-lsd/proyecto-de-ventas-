package sena.crudbasic.service;
import java.util.List;

import sena.crudbasic.Dto.CustomersDto;




public interface CustomersService {

    List<CustomersDto> findAll();

    CustomersDto findById(int id);

    List<CustomersDto> filterByName(String firstName);

    CustomersDto save(CustomersDto dto);

    boolean delete(int id);

    CustomersDto update(int id, CustomersDto dto);

}
