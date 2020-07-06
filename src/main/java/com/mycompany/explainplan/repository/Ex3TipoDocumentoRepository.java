package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex3TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex3TipoDocumentoRepository extends JpaRepository<Ex3TipoDocumento, Integer> {
}
