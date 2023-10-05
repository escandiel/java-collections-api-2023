package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }

        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Marcela Mozaica", 12345);
        agendaContatos.adicionarContato("Eu", 123456);
        agendaContatos.adicionarContato("Eu2", 1234567);
        agendaContatos.adicionarContato("Eu3", 123456);
        agendaContatos.adicionarContato("Marcela Mozaica", 12345);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Marcela Mozaica"));
        System.out.println("CONTATO ATUALIZADO: " + agendaContatos.atualizarNumeroContato("Marcela Mozaica", 123345));
        agendaContatos.exibirContatos();

    }
}
