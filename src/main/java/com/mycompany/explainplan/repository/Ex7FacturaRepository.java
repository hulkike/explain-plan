package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex7Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex7FacturaRepository extends JpaRepository<Ex7Factura, Integer> {
}
