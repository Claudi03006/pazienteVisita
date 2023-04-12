package com.savarino.integration;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.savarino.entities.Paziente;
import com.savarino.entities.Visita;
import com.savarino.services.PazienteService;
import com.savarino.services.VisitaService;


@RestController
@RequestMapping("api")
public class ClinicaREST {
	
	@Autowired
	private PazienteService pazienteService;
	
	@Autowired
	private VisitaService visitaService;
	
	@GetMapping("pazienti")
	List<Paziente> getPazienti() {
		
		System.out.println("---------------------------");
		return pazienteService.getPaziente();
		
	}
	
	@GetMapping("visite")
	List<Visita> getVisita() {
		
		return visitaService.getVisita();
		
	}
}
