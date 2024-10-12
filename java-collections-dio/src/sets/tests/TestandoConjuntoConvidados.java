package sets.tests;

import sets.classes.ConjuntoConvidados;
import sets.classes.Convidado;

public class TestandoConjuntoConvidados {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConjuntoConvidados conjConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjConvidados.contarConvidados() + 
				" convidados dentro do Set de Convidados");
		conjConvidados.adicionarConjConvidados("Convidado 1", 1234);
		conjConvidados.adicionarConjConvidados("Convidado 2", 1235);
		conjConvidados.adicionarConjConvidados("Convidado 3", 1236);
		conjConvidados.adicionarConjConvidados("Convidado 4", 1237);
		System.out.println("Existem " + conjConvidados.contarConvidados() + 
				" convidados dentro do Set de Convidados");
		conjConvidados.exibirConvidados();
		conjConvidados.removerConjConvidados(1236);
		System.out.println("Existem " + conjConvidados.contarConvidados() + 
				" convidados dentro do Set de Convidados");
		conjConvidados.exibirConvidados();
	}
}
