package projeto.professor.negocio;

import java.util.Collection;
import java.util.Date;

import projeto.professor.negocio.cadastros.CadastroHospedagem;
import projeto.professor.negocio.cadastros.CadastroHospede;
import projeto.professor.negocio.cadastros.CadastroReserva;
import projeto.professor.negocio.modelos.EnumClasseHotel;
import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.Reserva;

public class ControllerHotel {

	private ControllerHotel() {

	}

	private static ControllerHotel instance;

	public static ControllerHotel getInstance() {
		if (instance == null)
			instance = new ControllerHotel();

		return instance;
	}

	private IFabricaClasse getFactoryPorClasse(EnumClasseHotel classe) {
		IFabricaClasse fabricaClasse = null;

		if (classe == EnumClasseHotel.APART) {
			fabricaClasse = new FabricaClasseApart();
		} else if (classe == EnumClasseHotel.BUDGET) {
			fabricaClasse = new FabricaClasseBudget();
		} else if (classe == EnumClasseHotel.CLASSIC) {
			fabricaClasse = new FabricaClasseClassic();
		}
		return fabricaClasse;
	}

	public Hotel criarHotel(EnumClasseHotel classe, String nome, String endereco) {

		IFabricaClasse fabricaClasse = getFactoryPorClasse(classe);

		Hotel hotel = fabricaClasse.criarHotel(nome, endereco);

		return hotel;
	}

	public Quarto criarQuarto(Hotel hotel, Integer numero, Integer limHospedes, Boolean ehFumante, Double valor,
			String descricao, EnumTipoQuarto tipoQuarto) {
		IFabricaClasse fabricaClasse = getFactoryPorClasse(hotel.getClasse());

		Quarto quarto = fabricaClasse.criarQuarto(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);

		return quarto;
	}

	public Hospede criarHospede(String nome, String endereco, String telefone, Date dataNascimento) {
		return CadastroHospede.getInstance().criarHospede(nome, endereco, telefone, dataNascimento);
	}

	public Reserva criarReserva(Date dataInicio, Date dataFim, Hospede responsavel,
			Collection<Hospedagem> hospedagens) {
		return CadastroReserva.getInstance().criarReserva(dataInicio, dataFim, responsavel, hospedagens);
	}

	public Hospedagem criarHospedagem(Quarto quarto, Collection<Hospede> hospedes) {
		return CadastroHospedagem.getInstance().criarHospedagem(quarto, hospedes);
	}

}
