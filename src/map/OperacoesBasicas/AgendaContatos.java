package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Marcela Mozaica", 99999);
        agendaContatos.adicionarContato("Marcela Mozaica2", 99956);
        agendaContatos.adicionarContato("Marcela Mozaica3", 9969);
        agendaContatos.adicionarContato("Marcela Mozaica", 9995);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Marcela Mozaica3");
        agendaContatos.exibirContatos();
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Marcela Mozaica2"));

    }
}
