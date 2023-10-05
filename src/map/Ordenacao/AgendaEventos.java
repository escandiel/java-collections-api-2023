package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento() {
        LocalDate proximaData = null;
        Evento proximoEvento = null;
     LocalDate dataAtual =  LocalDate.now();
     Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
     for(Map.Entry<LocalDate, Evento> entry: eventosMap.entrySet()){
         if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
             proximaData = entry.getKey();
             proximoEvento = entry.getValue();
             System.out.println("O próximo evento: " + proximoEvento+ " acontecerá na data " + proximaData);
            break;
         }
     }
    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 15), "Evento1", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 16), "Evento2", "Atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 10), "Evento3", "Atracao3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 05), "Evento3", "Atracao4");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
