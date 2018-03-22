package exemplo.classes.ingredientes;

import exemplo.classes.Sanduba;
import exemplo.classes.SandubaDecorator;

public class Ovo extends SandubaDecorator {

	public Ovo(Sanduba sanduba) {
		this.sanduba = sanduba;
		this.preco = 1.00;
		this.ingredientes = ",ovo ";
	}
}
