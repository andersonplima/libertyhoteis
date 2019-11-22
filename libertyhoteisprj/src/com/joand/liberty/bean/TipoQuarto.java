package com.joand.liberty.bean;

import java.math.BigDecimal;

public class TipoQuarto {
	private int id;
	private String tipo;
	private int qtdMaxHospedes;
	private BigDecimal valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtdMaxHospedes() {
		return qtdMaxHospedes;
	}

	public void setQtdMaxHospedes(int qtdMaxHospedes) {
		this.qtdMaxHospedes = qtdMaxHospedes;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoQuarto(int id, String tipo, int qtdMaxHospedes, BigDecimal valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.qtdMaxHospedes = qtdMaxHospedes;
		this.valor = valor;
	}

}
