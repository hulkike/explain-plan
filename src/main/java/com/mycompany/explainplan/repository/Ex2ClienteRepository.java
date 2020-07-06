package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex2Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex2ClienteRepository extends JpaRepository<Ex2Cliente, Integer> {
}
