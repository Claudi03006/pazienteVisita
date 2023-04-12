package com.savarino.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "vista")
public class Visita {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToMany(mappedBy = "visite")
//	@JoinColumn(name="studente_id", nullable=false)
	@JsonIgnore
	private Set<Paziente> paziente = new HashSet<>();
	private String nome;
	public int getId() {
		return id;
	}
	
	public Set<Paziente> getPaziente() {
		return paziente;
	}

	public void setPaziente(Set<Paziente> paziente) {
		this.paziente = paziente;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
