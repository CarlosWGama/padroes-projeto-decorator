package atividade.classes.cores;

import atividade.classes.FormaGeometrica;
import atividade.classes.FormasGeometricaDecorator;

public class Vermelho  extends FormasGeometricaDecorator {

	public Vermelho(FormaGeometrica forma) {
			this.forma = forma;
	}
	
	public String getDescricao() {
		return this.forma.getDescricao() + " Vermelho";
	}

}
