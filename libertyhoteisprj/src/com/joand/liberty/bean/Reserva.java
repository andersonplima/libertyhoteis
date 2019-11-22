package com.joand.liberty.bean;

public class Reserva {
	
	private Hotel hotel;
	private Hospede hospede;
	private double valorHospedagem;
	private boolean encerrada;
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public double getValorHospedagem() {
		return valorHospedagem;
	}

	public void setValorHospedagem(double valorHospedagem) {
		this.valorHospedagem = valorHospedagem;
	}

	public boolean isEncerrada() {
		return encerrada;
	}

	public void setEncerrada(boolean encerrada) {
		this.encerrada = encerrada;
	}

	public boolean adicionarQuarto() {
		
		return true;
		
	}
	
	public boolean quitar() {
		
		return true;
		
	}

	public double calcularValor() {
		
		return 0.00;
		
	}
}
