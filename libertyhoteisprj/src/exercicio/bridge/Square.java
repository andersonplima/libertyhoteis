package exercicio.bridge;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Desenhei um quadrado!");
	}
	
	@Override
	public String toString() {
		return "quadrado";
	}

}
