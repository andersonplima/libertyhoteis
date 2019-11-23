package projeto.professor;

import java.util.Collection;
import java.util.Date;

public interface IFachadaHoteisLiberty {
	
	public Quarto criarQuarto(Hotel hotel, Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto);
	public Hotel criarHotel(String nome, String endereco, EnumClasseHotel classe);
	//public void fazerReserva(Hotel hotel, Hospede hospede, Date inicio, Date fim);
	//public Collection<Quartos> pesquisarQuartosDisponiveis(Date inicio, Date fim);
	//public void calcularValorHospedagem();

}
