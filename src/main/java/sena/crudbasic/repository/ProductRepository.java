package sena.crudbasic.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sena.crudbasic.model.Product;



// la utlizamos para filtrar diferentes productos 
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(""
        + "SELECT " + "p " +  "FROM " + "Product p " + "WHERE " + "p.name like %?1%" 
    )
    public List<Product>filterByName(String name );
}
