package sena.crudbasic.Dto;

public class ProductCategoriesIdDto {
    private int idProduct;
    private int idCategories;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    public ProductCategoriesIdDto(int idProduct, int idCategories) {
        this.idProduct = idProduct;
        this.idCategories = idCategories;
    }
}
