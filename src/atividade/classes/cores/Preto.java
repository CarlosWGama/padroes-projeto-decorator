package atividade.classes.cores;

import atividade.classes.FormaGeometrica;
import atividade.classes.FormasGeometricaDecorator;

public class Preto  extends FormasGeometricaDecorator {

	public Preto(FormaGeometrica forma) {
			this.forma = forma;
	}
	
	public String getDescricao() {
		return this.forma.getDescricao() + " Preto";
	}

}
