package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex8DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex8DetalleFacturaRepository extends JpaRepository<Ex8DetalleFactura, Integer> {
}
