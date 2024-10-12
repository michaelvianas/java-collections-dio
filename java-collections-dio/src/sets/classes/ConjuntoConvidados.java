package sets.classes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> conjConvidados;
	
	public ConjuntoConvidados() {
		this.conjConvidados = new HashSet<>(); 
	}
	
	public void adicionarConjConvidados(String nome, int codigoConvite) {
		conjConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConjConvidados(int codigoConvite) {
		Convidado convidadoARemover = null;
		for(Convidado c: conjConvidados) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoARemover = c;
				break;
			}
		}
		
		conjConvidados.remove(convidadoARemover);
	}
	
	public int contarConvidados() {
		return conjConvidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(conjConvidados);
	}
}
