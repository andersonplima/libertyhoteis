package projeto.professor;

import java.util.Date;

public class FachadaHoteisLiberty implements IFachadaHoteisLiberty {
	
	private static FachadaHoteisLiberty instance;
	
	private FachadaHoteisLiberty() {
		
	}

	public static FachadaHoteisLiberty getInstance() {
		
		if(instance == null) {
			instance = new FachadaHoteisLiberty();
		}
		
		return instance;
	}
	

	@Override
	public Quarto criarQuarto(Hotel hotel, Integer numero, Integer limHospedes, Boolean ehFumante, Double valor, String descricao,
			EnumTipoQuarto tipoQuarto) {
		
		IFabricaClasse fabricaClasse = null;
		
		if (hotel.getClasse() == EnumClasseHotel.APART) {
			fabricaClasse = new FabricaClasseApart();
		} else if (hotel.getClasse() == EnumClasseHotel.BUDGET) {
			fabricaClasse = new FabricaClasseBudget();
		} else if (hotel.getClasse() == EnumClasseHotel.CLASSIC) {
			fabricaClasse = new FabricaClasseClassic();
		}
		
		Quarto quarto = fabricaClasse.criarQuarto(numero, limHospedes, ehFumante, valor, descricao, tipoQuarto);
		
		return quarto;
	}

	@Override
	public Hotel criarHotel(String nome, String endereco, EnumClasseHotel classe) {
		
		IFabricaClasse fabricaClasse = null;
		
		if (classe == EnumClasseHotel.APART) {
		    fabricaClasse = new FabricaClasseApart();
		} else if (classe == EnumClasseHotel.BUDGET) {
			fabricaClasse = new FabricaClasseBudget();
		} else if (classe == EnumClasseHotel.CLASSIC) {
			fabricaClasse = new FabricaClasseClassic();
		}
		
		Hotel hotel = fabricaClasse.criarHotel(nome, endereco);
		
		return hotel;
	}

	@Override
	public Reserva reserva(Date dataInicio, Date dataFim, Hospede responsavel) {
		
		Reserva reserva = new Reserva(dataFim, dataFim, responsavel);
		
	//	repositorioReserva.cadastrarReserva(reserva);
		
		return reserva;
	}

		
	

}
