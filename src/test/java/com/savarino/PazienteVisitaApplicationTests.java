package com.savarino;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.savarino.entities.Paziente;

import com.savarino.entities.Visita;
import com.savarino.services.PazienteService;
import com.savarino.services.VisitaService;

@SpringBootTest
class PazienteVisitaApplicationTests {
	
	@Autowired
	PazienteService pazienteService;
	
	@Autowired
	VisitaService visitaService;

	@Test
	void contextLoads() {
	Paziente p = new Paziente();
		p.setNome("Claudio");
		
		Visita v = new Visita();
		Visita v2 = new Visita();
		
		v.setNome("oculistica");
		v2.setNome("dentistica");
		
//		s.setEsami(new ArrayList<>());
		
		p.getVisite().add(v2);
		p.getVisite().add(v);
	
		
		pazienteService.aggiungiPaziente(p);
		
//		e.setStudente(s);
		
//		esameService.aggiungiEsame(e);
	}

}
