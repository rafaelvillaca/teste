package com.fiveware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formulario")
public class Formulario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String nome;
	Boolean ingles;
	Boolean espanhol;
	String estadoCivil;
	Boolean trabalhando;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getIngles() {
		return ingles;
	}
	public void setIngles(Boolean ingles) {
		this.ingles = ingles;
	}
	public Boolean getEspanhol() {
		return espanhol;
	}
	public void setEspanhol(Boolean espanhol) {
		this.espanhol = espanhol;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Boolean getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(Boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}