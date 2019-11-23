package projeto.professor;

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
