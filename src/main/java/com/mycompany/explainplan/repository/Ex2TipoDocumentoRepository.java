package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex2TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex2TipoDocumentoRepository extends JpaRepository<Ex2TipoDocumento, Integer> {
}
