package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex9Cliente;
import com.mycompany.explainplan.domain.Ex9ClientePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex9ClienteRepository extends JpaRepository<Ex9Cliente, Ex9ClientePK> {
}
