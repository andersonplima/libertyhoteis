package projeto.professor.negocio.cadastros;

import java.util.Collection;

import projeto.professor.negocio.modelos.Hospedagem;
import projeto.professor.negocio.modelos.Hospede;
import projeto.professor.negocio.modelos.Quarto;

public class CadastroHospedagem {
	private CadastroHospedagem() {

	}

	private static CadastroHospedagem instance;

	public static CadastroHospedagem getInstance() {
		if (instance == null)
			instance = new CadastroHospedagem();

		return instance;
	}

	public Hospedagem criarHospedagem(Quarto quarto, Collection<Hospede> hospedes) {
		Hospedagem hospedagem = new Hospedagem(quarto, hospedes);
		return hospedagem;
	}


}
