package maps.classes;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatos;
	
	public AgendaContatos() {
		// TODO Auto-generated constructor stub
		this.agendaContatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatos.isEmpty()) {
			agendaContatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatos.isEmpty()) {
			numeroPorNome = agendaContatos.get(nome);
		}
		return numeroPorNome;
	}
}
