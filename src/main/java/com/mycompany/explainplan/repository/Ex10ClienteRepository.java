package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex10Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex10ClienteRepository extends JpaRepository<Ex10Cliente, Integer> {

}
