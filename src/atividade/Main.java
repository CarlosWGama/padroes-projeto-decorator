package atividade;

import atividade.classes.Circulo;
import atividade.classes.FormaGeometrica;
import atividade.classes.cores.Azul;
import atividade.classes.cores.Preto;

public class Main {

	public static void main(String args[]) {
		FormaGeometrica forma = new Circulo();
		
		forma = new Azul(forma);
		forma = new Preto(forma);
		System.out.println(forma.getDescricao());
	}
}
