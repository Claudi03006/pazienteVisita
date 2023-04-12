package com.savarino.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "paziente")
public class Paziente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaziente;
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Paziente_Visita", 
        joinColumns = { @JoinColumn(name = "paziente_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "visita_id") }
    )
	private List<Visita> visite = new ArrayList<>();
	private String nome;
	private String cognome;
	private String numeroTelefono;
	
	public int getIdPaziente() {
		return idPaziente;
	}
	public void setIdPaziente(int idPaziente) {
		this.idPaziente = idPaziente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public List<Visita> getVisite() {
		return visite;
	}
	public void setVisite(List<Visita> visite) {
		this.visite = visite;
	}



	

}
