package exemplo;

import exemplo.classes.Sanduba;
import exemplo.classes.SandubaFile;

public class Main {

	
	public static void main(String args[]) {
		Sanduba sanduba = new SandubaFile();
		System.out.println("Ingredientes: " + sanduba.getIngredientes());
		System.out.println("Preço: " + sanduba.getPreco());
	}
}
