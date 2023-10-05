package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}
