package com.savarino.services;

import java.util.List;

import com.savarino.entities.Paziente;



public interface PazienteService {
	List<Paziente> getPaziente();
	void aggiungiPaziente(Paziente p);
}
