package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex1TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex1TipoDocumentoRepository extends JpaRepository<Ex1TipoDocumento, String> {
}
