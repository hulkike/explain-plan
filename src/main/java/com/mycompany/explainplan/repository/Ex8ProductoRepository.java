package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex8Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex8ProductoRepository extends JpaRepository<Ex8Producto, Integer> {
}
