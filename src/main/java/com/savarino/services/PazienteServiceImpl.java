package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Paziente;
import com.savarino.repos.PazienteDAO;

@Service
public class PazienteServiceImpl implements PazienteService{
	
	@Autowired
	PazienteDAO dao;

	@Override
	public List<Paziente> getPaziente() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void aggiungiPaziente(Paziente p) {
		// TODO Auto-generated method stub
		dao.save(p);
	}

}
