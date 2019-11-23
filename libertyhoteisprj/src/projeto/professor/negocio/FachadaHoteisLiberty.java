package projeto.professor.negocio;

import java.util.Collection;
import java.util.Date;

import projeto.professor.negocio.modelos.EnumClasseHotel;
import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.Reserva;

public class FachadaHoteisLiberty implements IFachadaHoteisLiberty {

	private static FachadaHoteisLiberty instance;

	private FachadaHoteisLiberty() {

	}

	public static FachadaHoteisLiberty getInstance() {

		if (instance == null) {
			instance = new FachadaHoteisLiberty();
		}

		return instance;
	}

	@Override
	public Quarto criarQuarto(Hotel hotel, Integer numero, Integer limHospedes, Boolean ehFumante, Double valor,
			String descricao, EnumTipoQuarto tipoQuarto) {
		return ControllerHotel.getInstance().criarQuarto(hotel, numero, limHospedes, ehFumante, valor, descricao,
				tipoQuarto);

	}

	@Override
	public Hotel criarHotel(String nome, String endereco, EnumClasseHotel classe) {
		return ControllerHotel.getInstance().criarHotel(classe, nome, endereco);

	}

	@Override
	public Hospede criarHospede(String nome, String endereco, String telefone, Date dataNascimento) {
		return ControllerHotel.getInstance().criarHospede(nome, endereco, telefone, dataNascimento);
	}

	@Override
	public Reserva reserva(Date dataInicio, Date dataFim, Hospede responsavel, Collection<Hospedagem> hospedagens) {
		return ControllerHotel.getInstance().criarReserva(dataInicio, dataFim, responsavel, hospedagens);
	}

	@Override
	public Hospedagem criarHospedagem(Quarto quarto, Collection<Hospede> hospedes) {
		return ControllerHotel.getInstance().criarHospedagem(quarto, hospedes);
	}
}
