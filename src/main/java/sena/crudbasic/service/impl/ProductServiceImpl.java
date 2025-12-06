package sena.crudbasic.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.crudbasic.Dto.ProductDto;
import sena.crudbasic.mapper.ProductMapper;
import sena.crudbasic.model.Product;
import sena.crudbasic.repository.ProductRepository;
import sena.crudbasic.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public List<ProductDto> findAll() {
        return repo.findAll().stream().map(ProductMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(int id) {
        Product product = repo.findById(id).orElse(null);
        return ProductMapper.toDto(product); // esto me quiere decier que el modelo produc me lo cambie a dto
    }

    @Override
    public List<ProductDto> filterByName(String name) { // foltramos por name de producto
        return repo.filterByName(name).stream().map(ProductMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto save(ProductDto dto) {

        if (dto == null) {
            throw new IllegalArgumentException("El DTO no puede ser null");
        }
        // convertimos el dto en una entidad
        Product productDb = ProductMapper.toEntity(dto);
        if (productDb == null) {
            throw new IllegalStateException("No se pudo mapear a entidad");
        }
        // la guardamos en la base de dats
        Product saved = repo.save(productDb);
        // la entidad guardada la convertimos de nuevo a dto
        return ProductMapper.toDto(saved);
    }

    @Override
    public boolean delete(int id) {

        Product productDb = repo.findById(id).orElse(null);
        if (productDb == null) {
            return false;
        }
        repo.delete(productDb);
        return true;
    }

    @Override
    public ProductDto update(int id, ProductDto dto) {
        Product existing = repo.findById(id).orElse(null);
        if (existing == null) {
            throw new IllegalStateException("El producto con id " + id + " no existe");
        }

        ProductMapper.updateEntityFromDto(dto, existing);

        Product saved = repo.save(existing);

        return ProductMapper.toDto(saved);

    }

}
