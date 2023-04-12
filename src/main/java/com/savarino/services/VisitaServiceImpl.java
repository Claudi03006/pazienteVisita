package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Visita;
import com.savarino.repos.VisitaDAO;

@Service
public class VisitaServiceImpl implements VisitaService{
	
	@Autowired
	private VisitaDAO dao;

	@Override
	public List<Visita> getVisita() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void aggiungiVisita(Visita v) {
		// TODO Auto-generated method stub
		dao.save(v);
	}

}
