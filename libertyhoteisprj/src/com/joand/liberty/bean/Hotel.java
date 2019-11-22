package com.joand.liberty.bean;

import java.util.HashSet;

public class Hotel {
	private int id;
	private String nome;
	private String classe;
	private HashSet<Comodidade> comodidades;

	public int getId() {
		return id;
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

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void addComodidade(Comodidade comodidade) {
		this.comodidades.add(comodidade);
	}

	public Hotel(int id, String nome, String classe) {
		super();
		this.id = id;
		this.nome = nome;
		this.classe = classe;
		this.comodidades = new HashSet<>();
	}
}
