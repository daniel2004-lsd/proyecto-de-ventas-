package sena.crudbasic.mapper;

import sena.crudbasic.Dto.ProductDto;
import sena.crudbasic.model.Product;

public class ProductMapper {
    // dto a entity
    public static Product toEntity(ProductDto dto){
        if (dto==null) {
                return null;
        }
        Product product = new Product();
        product.setName(dto.getName());
        product.setStock(dto.getStock());
        product.setPrice(dto.getPrice());
        return product;
    }

// entity a dto
    public static ProductDto toDto(Product product){
        if (product==null) {
            return null;
        }

        ProductDto dto = new ProductDto();
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setStock(product.getStock());

        return dto;
    }

    public static void updateEntityFromDto(ProductDto dto, Product entity) {
    if (dto.getName() != null) entity.setName(dto.getName());
    if (dto.getPrice() != null) entity.setPrice(dto.getPrice());

}

}
