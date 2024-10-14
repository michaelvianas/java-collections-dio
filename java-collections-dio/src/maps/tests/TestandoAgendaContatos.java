package maps.tests;

import maps.classes.AgendaContatos;

public class TestandoAgendaContatos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Michael", 123456);
		agenda.adicionarContato("Michael", 5665);
		agenda.adicionarContato("Michael Viana", 11111111);
		agenda.adicionarContato("Michael DIO", 654987);
		agenda.adicionarContato("Maria", 11111111);
		agenda.adicionarContato("Michael", 44444);
		
		agenda.exibirContatos();
		
		agenda.removerContato("Michael DIO");
		
		agenda.exibirContatos();
		System.out.println(agenda.pesquisarPorNome("Michael"));
	}
}
