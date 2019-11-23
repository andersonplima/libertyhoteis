package exercicio.bridge;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Desenhei um circulo!");
	}

	@Override
	public String toString() {
		return "circulo";
	}

	
}
