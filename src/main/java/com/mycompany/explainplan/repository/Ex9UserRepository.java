package com.mycompany.explainplan.repository;

import com.mycompany.explainplan.domain.Ex9User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ex9UserRepository extends JpaRepository<Ex9User,String> {
}
