package lists.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lists.classes.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoa {
	private List<Pessoa> listaDePessoas;
	
	public OrdenacaoPessoa() {
		this.listaDePessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(listaDePessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
		Collections.sort(listaDePessoas, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
}
