package exemplo.classes.ingredientes;

import exemplo.classes.Sanduba;
import exemplo.classes.SandubaDecorator;

public class Bacon extends SandubaDecorator {

	public Bacon(Sanduba sanduba) {
		this.sanduba = sanduba;
		this.preco = 3.00;
		this.ingredientes = ",bacon ";
	}
}