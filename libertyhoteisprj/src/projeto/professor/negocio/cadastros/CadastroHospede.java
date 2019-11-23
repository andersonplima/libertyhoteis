package projeto.professor.negocio.cadastros;

import java.util.Date;

import projeto.professor.negocio.modelos.Hospede;

public class CadastroHospede {
	private CadastroHospede() {

	}

	private static CadastroHospede instance;

	public static CadastroHospede getInstance() {
		if (instance == null)
			instance = new CadastroHospede();

		return instance;
	}

	public Hospede criarHospede(String nome, String endereco, String telefone, Date dataNascimento) {
		Hospede hospede = new Hospede(nome, endereco, telefone, dataNascimento);
		return hospede;
	}


}
