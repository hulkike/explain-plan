package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex8Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex8FacturaRepository extends JpaRepository<Ex8Factura, Integer> {
}
