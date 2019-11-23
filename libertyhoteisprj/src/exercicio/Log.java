package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Log {

	private Collection<String> textos;

	public Collection<String> getTextos() {
		return textos;
	}

	public void setTextos(Collection<String> textos) {
		this.textos = textos;
	}
	
	public static void main(String[] args) {
		
		Log log = new Log();
		log.setTextos(new ArrayList<String>());
		
		log.getTextos().add("Log1");
		log.getTextos().add("Log2");
		log.getTextos().add("Log3");
		
		Log log2 = new Log();
		log2.setTextos(new ArrayList<String>());
		
		log2.getTextos().add("Log4");
		log2.getTextos().add("Log5");
		log2.getTextos().add("Log6");
		
		System.out.println(log2.getTextos());
	}
}
