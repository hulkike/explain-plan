package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex5Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex5FacturaRepository extends JpaRepository<Ex5Factura, Integer> {
}
