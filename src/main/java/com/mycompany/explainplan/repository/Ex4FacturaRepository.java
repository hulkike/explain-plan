package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex4Factura;
import com.mycompany.explainplan.domain.Ex4FacturaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex4FacturaRepository extends JpaRepository<Ex4Factura, Ex4FacturaPK> {
}
