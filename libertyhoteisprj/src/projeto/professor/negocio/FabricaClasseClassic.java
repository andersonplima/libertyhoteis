package projeto.professor.negocio;

import projeto.professor.negocio.modelos.EnumTipoQuarto;
import projeto.professor.negocio.modelos.Hotel;
import projeto.professor.negocio.modelos.HotelClassic;
import projeto.professor.negocio.modelos.Quarto;
import projeto.professor.negocio.modelos.QuartoClassic;

public class FabricaClasseClassic implements IFabricaClasse {

	@Override
	public Hotel criarHotel(String nome, String endereco) {
		// TODO Auto-generated method stub
		return new HotelClassic(nome, endereco);
	}

	@Override
	public Quarto criarQuarto(Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		// TODO Auto-generated method stub
		return new QuartoClassic(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
	}
	
}
