package atividade;

import atividade.classes.Circulo;
import atividade.classes.FormaGeometrica;

public class Main {

	public static void main(String args[]) {
		FormaGeometrica forma = new Circulo();
		
		System.out.println(forma.getDescricao());
	}
}
