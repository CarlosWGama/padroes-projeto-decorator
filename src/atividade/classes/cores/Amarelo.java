package atividade.classes.cores;

import atividade.classes.FormaGeometrica;
import atividade.classes.FormasGeometricaDecorator;

public class Amarelo extends FormasGeometricaDecorator {

	public Amarelo(FormaGeometrica forma) {
			this.forma = forma;
	}
	
	public String getDescricao() {
		return this.forma.getDescricao() + " Amarelo";
	}

}
