package projeto.professor.negocio;

import java.util.Collection;
//import java.util.Collection;
import java.util.Date;

import projeto.professor.negocio.modelos.EnumClasseHotel;
import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.Reserva;

public interface IFachadaHoteisLiberty {
	
	public Quarto criarQuarto(Hotel hotel, Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto);
	public Hotel criarHotel(String nome, String endereco, EnumClasseHotel classe);
	public Hospede criarHospede(String nome, String endereco, String telefone, Date dataNascimento);
	public Reserva reserva(Date dataInicio, Date dataFim, Hospede responsavel, Collection<Hospedagem> hospedagens);
	public Hospedagem criarHospedagem(Quarto quarto, Collection<Hospede> hospedes);
	//public Collection<Quartos> pesquisarQuartosDisponiveis(Date inicio, Date fim);
	//public void calcularValorHospedagem();

}
