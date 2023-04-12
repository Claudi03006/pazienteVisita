package com.savarino.services;

import java.util.List;

import com.savarino.entities.Visita;



public interface VisitaService {
	List<Visita> getVisita();
	void aggiungiVisita(Visita v);
}
