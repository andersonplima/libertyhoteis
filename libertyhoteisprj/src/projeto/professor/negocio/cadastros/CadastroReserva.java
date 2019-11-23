package projeto.professor.negocio.cadastros;

import java.util.Collection;
import java.util.Date;

import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Reserva;

public class CadastroReserva {
	private CadastroReserva() {

	}

	private static CadastroReserva instance;

	public static CadastroReserva getInstance() {
		if (instance == null)
			instance = new CadastroReserva();

		return instance;
	}

	public Reserva criarReserva(Date dataInicio, Date dataFim, Hospede responsavel,
			Collection<Hospedagem> hospedagens) {
		Reserva reserva = new Reserva(dataFim, dataFim, responsavel);
		reserva.setHospedagens(hospedagens);
		return reserva;
	}


}
