package com.example.lab4_20193733.repository;


import com.example.lab4_20193733.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

    @Query(value = "SELECT * FROM employees WHERE first_name LIKE %?1% OR last_name LIKE %?1%", nativeQuery = true)
    List<Empleados> findByName(String search, String search2);


}
