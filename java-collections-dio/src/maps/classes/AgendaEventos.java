package maps.classes;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entrada: eventosTreeMap.entrySet()) {
			if(entrada.getKey().isEqual(dataAtual) || entrada.getKey().isAfter(dataAtual)) {
				proximaData = entrada.getKey();
				proximoEvento = entrada.getValue();
				System.out.println("O próximo evento: " + proximoEvento 
				+ " acontecerá na data " + proximaData + ".");
				break;
			}
		}
	}
}
