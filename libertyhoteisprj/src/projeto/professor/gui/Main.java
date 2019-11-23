package projeto.professor.gui;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import projeto.professor.negocio.*;
import projeto.professor.negocio.modelos.EnumClasseHotel;
import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.Reserva;

public class Main {

	public static void main(String[] args) {
		IFachadaHoteisLiberty fachada = FachadaHoteisLiberty.getInstance();
		
		Hotel hotelUmburana = fachada.criarHotel("Hotel Umburana", "Rua das couves, 35", EnumClasseHotel.CLASSIC);
		Quarto quarto101 = fachada.criarQuarto(hotelUmburana, 101, 2, false, 100.0, "QUARTO SIMPLES", EnumTipoQuarto.PADRAO);
		Quarto quarto203 = fachada.criarQuarto(hotelUmburana, 203, 2, false, 100.0, "QUARTO SIMPLES", EnumTipoQuarto.PADRAO);
		Hospede joao = fachada.criarHospede("Joao", "Rua do rio, 10", "222-2222", Date.valueOf("1970-10-10"));
		Hospede anderson = fachada.criarHospede("Anderson", "Rua do estrado, 15", "333-3333", Date.valueOf("1983-10-10"));
		
		ArrayList<Hospede> hospedes101 = new ArrayList<>();
		hospedes101.add(joao);
		Hospedagem hospedagem101 = fachada.criarHospedagem(quarto101, hospedes101);
		
		ArrayList<Hospede> hospedes203 = new ArrayList<>();
		hospedes203.add(anderson);
		Hospedagem hospedagem203 = fachada.criarHospedagem(quarto203, hospedes203);
		
		Collection<Hospedagem> hospedagens = new ArrayList<>();
		hospedagens.add(hospedagem101);
		hospedagens.add(hospedagem203);
		
		Reserva reserva = fachada.reserva(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now().plusDays(3)), joao, hospedagens);
		
		System.out.println(reserva);
	}

}
