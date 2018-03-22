package atividade.classes.cores;

import atividade.classes.FormaGeometrica;
import atividade.classes.FormasGeometricaDecorator;

public class Azul extends FormasGeometricaDecorator {

	public Azul(FormaGeometrica forma) {
			this.forma = forma;
	}
	
	public String getDescricao() {
		return this.forma.getDescricao() + " Azul";
	}
}
