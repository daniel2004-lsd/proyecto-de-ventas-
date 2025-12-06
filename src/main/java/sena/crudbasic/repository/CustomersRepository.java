package sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sena.crudbasic.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

    @Query("SELECT c FROM Customers c WHERE c.firstName LIKE %?1%")
    List<Customers> filterByName(String firstName);

    boolean existsByEmail(String email);
}
