package sena.crudbasic.Dto;

public class ProductCategoriesDto {
    private ProductCategoriesIdDto productCategoriaId;
    private ProductDto product;
    private CategoriesDto categories;

    public ProductCategoriesIdDto getProductCategoriaId() {
        return productCategoriaId;
    }

    public void setProductCategoriaId(ProductCategoriesIdDto productCategoriaId) {
        this.productCategoriaId = productCategoriaId;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public CategoriesDto getCategories() {
        return categories;
    }

    public void setCategories(CategoriesDto categories) {
        this.categories = categories;
    }
}
