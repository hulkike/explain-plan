package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex4DetalleFactura;
import com.mycompany.explainplan.domain.Ex4DetalleFacturaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex4DetalleFacturaRepository extends JpaRepository<Ex4DetalleFactura, Ex4DetalleFacturaPK> {
}
