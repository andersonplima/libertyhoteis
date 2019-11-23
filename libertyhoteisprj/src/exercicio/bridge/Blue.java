package exercicio.bridge;

public class Blue extends Color {

	@Override
	public void paint(Shape shape) {
		System.out.println("Pintei o " + shape + " de azul");
	}

}
