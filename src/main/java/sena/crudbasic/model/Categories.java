package sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_categories")
    private int idCategories;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    

}
