package maps.tests;

import maps.classes.EstoqueProdutos;
import maps.classes.Produto;

public class TestandoProdutos {
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
		estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
		estoque.adicionarProduto(3L, "Produto C", 15.0, 2);
		
		estoque.exibirProdutos();
		
		System.out.println(estoque.calcularValorTotalEstoque());
		System.out.println(estoque.obterProdutoMaisBarato());
		System.out.println(estoque.obterProdutoMaisCaro());
	}
}
