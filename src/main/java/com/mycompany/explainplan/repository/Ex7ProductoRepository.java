package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex7Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex7ProductoRepository extends JpaRepository<Ex7Producto, Integer> {
}
