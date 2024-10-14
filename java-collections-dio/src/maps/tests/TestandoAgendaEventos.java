package maps.tests;

import java.time.LocalDate;
import java.time.Month;

import maps.classes.AgendaEventos;

public class TestandoAgendaEventos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 15), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 23), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 3), "Evento 3", "Atração 3");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
}
