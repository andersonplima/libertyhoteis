package projeto.professor.negocio.modelos;

//import java.util.Arrays;

public class HotelApart extends Hotel {

	public HotelApart(String nome, String endereco) {
		super(nome, endereco, EnumCafeManha.NENHUM, EnumClasseHotel.APART);
		
		this.getComodidades().add(EnumComodidade.ACADEMIA);
		this.getComodidades().add(EnumComodidade.ESTACIONAMENTO);
		this.getComodidades().add(EnumComodidade.PISCINA);
		this.getComodidades().add(EnumComodidade.SINUCA);
		
		//this.getComodidades().addAll(Arrays.asList(EnumComodidade.ACADEMIA, EnumComodidade.ESTACIONAMENTO, EnumComodidade.PISCINA, EnumComodidade.SINUCA));
	}

}
