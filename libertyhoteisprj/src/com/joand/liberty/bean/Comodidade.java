package com.joand.liberty.bean;

public class Comodidade {
	private int id;
	private String descricao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Comodidade(int id, String descricao) {
		super();
		this.descricao = descricao;
		this.id = id;
	}
}
