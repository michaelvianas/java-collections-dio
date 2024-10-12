package sets.classes;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
	private Set<Contato> conjContatos;
	
	public AgendaContatos() {
		this.conjContatos = new HashSet<>();
	} 
	
	public void adicionarContatos(String nome, int numero) {
		conjContatos.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(conjContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c: conjContatos) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for(Contato c: conjContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
}
