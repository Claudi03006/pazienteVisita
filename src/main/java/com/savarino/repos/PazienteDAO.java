package com.savarino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Paziente;
public interface PazienteDAO extends JpaRepository<Paziente, Integer> {

}
