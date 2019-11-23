package projeto.professor.negocio;

import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.HotelApart;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.QuartoApart;

public class FabricaClasseApart implements IFabricaClasse {

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		// TODO Auto-generated method stub
		return new HotelApart(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao, EnumTipoQuarto tipoQuarto) {
		// TODO Auto-generated method stub
		return new QuartoApart(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}

}
