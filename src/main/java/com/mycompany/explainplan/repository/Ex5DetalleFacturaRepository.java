package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex5DetalleFactura;
import com.mycompany.explainplan.domain.Ex5DetalleFacturaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex5DetalleFacturaRepository extends JpaRepository<Ex5DetalleFactura, Ex5DetalleFacturaPK> {
}
