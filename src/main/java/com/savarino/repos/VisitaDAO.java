package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savarino.entities.Visita;

@Repository
public interface VisitaDAO extends JpaRepository<Visita, Integer>{

}
