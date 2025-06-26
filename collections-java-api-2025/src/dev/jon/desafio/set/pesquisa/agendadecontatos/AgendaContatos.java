package dev.jon.desafio.set.pesquisa.agendadecontatos;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!agendaContatos.isEmpty()) {
            System.out.println("\n[DEBUG] - PESQUISANDO " + nome + "...");
            boolean findContatoPorNome = false;
            for(Contato contato : agendaContatos) {
                if(contato.getNome().startsWith(nome)) {
                    findContatoPorNome = true;
                    contatosPorNome.add(contato);
                }
            }

            if(!findContatoPorNome) {
                System.out.println("[INFO] - CONTATO " + nome + ", NÃO EXISTE NA AGENDA");
            }
        }else {
            System.out.println("\n[INFO] - LISTA DE CONTATOS VAZIA");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        if(!agendaContatos.isEmpty()) {
            Contato contatoAtualizado = null;
            boolean findContato = false;
            for(Contato contato : agendaContatos) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    findContato = true;
                    System.out.println("[DEBUG] - NÚMERO ANTIGO do " + nome + " - " + contato.getNumeroTelefone());

                    contato.setNumeroTelefone(novoNumero);
                    contatoAtualizado = contato;

                    System.out.println("[DEBUG] - NOVO NÚMERO do " + nome + " - " + contato.getNumeroTelefone());
                    break;
                }
            }

            if(!findContato) {
                System.out.println("\n[INFO] - CONTATO " + nome + ", NÃO EXISTE NA AGENDA PARA SER ATUALIZADO");
            }
            return contatoAtualizado;
        }else {
            System.out.println("\n[INFO] - LISTA DE CONTATOS VAZIA");
            return null;
        }
    }

}
