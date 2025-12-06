package sena.crudbasic.repository;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {
 @Query(""
        + "SELECT " + "r " +  "FROM " + "Role r " + "WHERE " + "r.name like %?1%" 
    )
    public List<Role>filterByName(String name );
}
