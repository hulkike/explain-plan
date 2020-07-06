package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex1Cliente;
import com.mycompany.explainplan.domain.Ex1ClientePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex1ClienteRepository extends JpaRepository<Ex1Cliente, Ex1ClientePK> {
}
