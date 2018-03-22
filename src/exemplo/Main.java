package exemplo;

import exemplo.classes.Sanduba;
import exemplo.classes.SandubaFile;
import exemplo.classes.ingredientes.Bacon;
import exemplo.classes.ingredientes.Ovo;

public class Main {

	public static void main(String args[]) {
		Sanduba sanduba = new SandubaFile();
		
		sanduba = new Ovo(sanduba); //Adiciona +1 ovo
		sanduba = new Ovo(sanduba); //Adiciona outro ovo
		sanduba = new Bacon(sanduba); //Adiciona bacon
		//Os ingredientes que o
		System.out.println("Ingredientes: " + sanduba.getIngredientes());
		System.out.println("Preço: " + sanduba.getPreco());
	}
}
