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

    public int getIdCategories() {
        return idCategories;
    }

    public Categories(int idCategories, String name, String description) {
        this.idCategories = idCategories;
        this.name = name;
        this.description = description;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

}
