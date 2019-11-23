package projeto.professor.negocio.modelos;

public class QuartoPadrao extends Quarto{

	public QuartoPadrao(Integer numero, Boolean ehFumante) {
		super(numero, 2, ehFumante, 100.00, "Quarto Padr�o",EnumTipoQuarto.PADRAO);
	}
}
