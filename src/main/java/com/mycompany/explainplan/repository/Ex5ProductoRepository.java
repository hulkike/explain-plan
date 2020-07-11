package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex5Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex5ProductoRepository extends JpaRepository<Ex5Producto, Integer> {
}
