    package sena.crudbasic.service;

    import java.util.List;

    import sena.crudbasic.Dto.ProductDto;
    public interface ProductService {




        List<ProductDto> findAll();

        ProductDto findById(int id);

        List<ProductDto> filterByName(String firstName);

        ProductDto save(ProductDto dto);

        boolean delete(int id);
        
        ProductDto update(int id, ProductDto dto);

        
    }

