package projeto.professor.negocio.modelos;

public class QuartoFamilia extends Quarto{
	
	public QuartoFamilia(Integer numero, Boolean ehFumante) {
		super(numero, 4, ehFumante, 150.00, "Quarto Fam�lia",EnumTipoQuarto.FAMILIA);
	}
	
}
