package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex10User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex10UserRepository extends JpaRepository<Ex10User, Integer> {
}
