package exemplo.classes.ingredientes;

import exemplo.classes.Sanduba;
import exemplo.classes.SandubaDecorator;

public class Queijo  extends SandubaDecorator {

	public Queijo(Sanduba sanduba) {
		this.sanduba = sanduba;
		this.preco = 1.50;
		this.ingredientes = ",queijo ";
	}

}
