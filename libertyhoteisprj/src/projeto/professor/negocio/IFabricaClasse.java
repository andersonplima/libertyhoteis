package projeto.professor.negocio;

import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.Quarto;

public interface IFabricaClasse {

	public Hotel criarHotel(String nome, String endereco);
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao, EnumTipoQuarto tipoQuarto);
	
}
