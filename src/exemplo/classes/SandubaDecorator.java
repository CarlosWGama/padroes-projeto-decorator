package exemplo.classes;

public class SandubaDecorator extends Sanduba {

	protected Sanduba sanduba;
	
	@Override
	public String getIngredientes() {
		return sanduba.getIngredientes() + ingredientes;
	}
	
	@Override
	public double getPreco() {
		return sanduba.getPreco() + preco;
	}
}


