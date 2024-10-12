package sets.tests;

import sets.classes.*;

public class TestandoContatos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.exibirContatos();
		agenda.adicionarContatos("Michael", 12345678);
		agenda.adicionarContatos("Michael", 56656);
		agenda.adicionarContatos("Michael Viana", 11111111);
		agenda.adicionarContatos("Michael DIO", 566567);
		agenda.adicionarContatos("Júlia", 22222222);
		agenda.exibirContatos();
		System.out.println(agenda.pesquisarPorNome("Michael Viana"));
		agenda.atualizarContato("Michael Viana", 22222222);
		System.out.println(agenda.pesquisarPorNome("Michael Viana"));
		
	}
}
