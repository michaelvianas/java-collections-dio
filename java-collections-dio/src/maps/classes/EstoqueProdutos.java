package maps.classes;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		if(!estoqueProdutosMap.isEmpty()) {
			double menorPreco = Double.MAX_VALUE;
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreco) {
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		if(!estoqueProdutosMap.isEmpty()) {
			double maiorPreco = Double.MIN_VALUE;
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
}
