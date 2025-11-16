package sena.crudbasic.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProducCategories")
public class ProductCategories {

    @EmbeddedId
    private ProductCategoriesId productCategoriaId;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne
    @MapsId("idCategories")
    @JoinColumn(name = "id_categories")
    private Categories categories;

    
}
