package lists.tests;

import lists.classes.Livro;
import lists.classes.CatalogoLivros;

public class TestandoCatalogoLivros {
	public static void main(String[] args) {
		CatalogoLivros catalogoDeLivros = new CatalogoLivros();
		catalogoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoDeLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
		catalogoDeLivros.adicionarLivro("Livro 3", "Autor 3", 2019);
		catalogoDeLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(catalogoDeLivros.pesquisarPorIntervaloAnos(1994, 1996));
	}
}
