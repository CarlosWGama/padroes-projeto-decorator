package atividade.classes.cores;

import atividade.classes.FormaGeometrica;
import atividade.classes.FormasGeometricaDecorator;

public class Branco extends FormasGeometricaDecorator {

	public Branco(FormaGeometrica forma) {
			this.forma = forma;
	}
	
	public String getDescricao() {
		return this.forma.getDescricao() + " Branco";
	}

}
