package sena.crudbasic.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sena.crudbasic.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
@Query("SELECT r FROM Role r WHERE LOWER(r.name) LIKE LOWER(CONCAT('%', :name, '%'))")
List<Role> filterByName(@Param("name") String name);
boolean existsByName(String name);


}
