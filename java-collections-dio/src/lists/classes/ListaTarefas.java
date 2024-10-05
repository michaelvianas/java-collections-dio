package lists.classes;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {
	private List<Tarefa> listaDeTarefas;
	
	public ListaTarefas() {
		// TODO Auto-generated constructor stub
		this.listaDeTarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaDeTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasARemover = new ArrayList<>();
		for(Tarefa t: listaDeTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasARemover.add(t);
			}
		}
		listaDeTarefas.removeAll(tarefasARemover);
	}
	
	public int obterNumeroTarefas() {
		return listaDeTarefas.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(listaDeTarefas);
	}
}
