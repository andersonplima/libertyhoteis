package com.joand.liberty.bean;

public class Hospede {
	
	private int idHospede;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	public int getIdHospede() {
		return idHospede;
	}

	public void setIdHospede(int idHospede) {
		this.idHospede = idHospede;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean fazerReserva() {
		
		return true;
		
	}
}
