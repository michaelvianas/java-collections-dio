package lists.tests;

import lists.classes.*;

public class TestandoTarefas {
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		
		listaTarefa.obterDescricaoTarefas();
		System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTarefas());
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.obterDescricaoTarefas();
		System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTarefas());
		listaTarefa.removerTarefa("Tarefa 2");
		listaTarefa.obterDescricaoTarefas();
		System.out.println("Número de tarefas: " + listaTarefa.obterNumeroTarefas());
	}
}
