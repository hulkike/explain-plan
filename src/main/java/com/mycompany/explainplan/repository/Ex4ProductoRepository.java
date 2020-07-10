package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex4Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex4ProductoRepository extends JpaRepository<Ex4Producto, String> {
}
