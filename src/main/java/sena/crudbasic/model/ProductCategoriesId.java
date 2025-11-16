package sena.crudbasic.model;

import java.io.Serializable;

import jakarta.persistence.Column;

public class ProductCategoriesId implements Serializable{
    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "id_categories")
    private int idCategories;


    public ProductCategoriesId(int idProduct, int idCategories) {
        this.idProduct = idProduct;
        this.idCategories = idCategories;
    }

    
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
}

