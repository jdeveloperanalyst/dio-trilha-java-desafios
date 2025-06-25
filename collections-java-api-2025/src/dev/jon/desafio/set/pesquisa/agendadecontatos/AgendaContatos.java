package dev.jon.desafio.set.pesquisa.agendadecontatos;

import java.sql.SQLOutput;
import java.util.HashSet;

public class AgendaContatos {
    private HashSet<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public void pesquisarPorNome(String nome) {
        if(!agendaContatos.isEmpty()) {
            boolean findContato = false;

            for(Contato contato : agendaContatos) {
                if(contato.getNome().equalsIgnoreCase(nome)) {
                    findContato = true;
                    System.out.println("[DEBUG] - PESQUISANDO " + nome + "...");
                    System.out.println(contato);
                    break;
                }
            }

            if(!findContato) {
                System.out.println("\n[INFO] - CONTATO " + nome + ", NÃO EXISTE NA AGENDA");
            }
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        if(!agendaContatos.isEmpty()) {
            boolean findContato = false;
            for(Contato contato : agendaContatos) {
                if(contato.getNome().equals(nome)) {
                    findContato = true;
                    agendaContatos.remove(contato);
                    agendaContatos.add(new Contato(nome, novoNumero));

                    System.out.println("[DEBUG] - NÚMERO ANTIGO - " + contato.getNumeroTelefone());
                    System.out.println("[DEBUG] - NOVO NÚMERO - " + novoNumero);
                    break;
                }
            }
            if(!findContato) {
                System.out.println("\n[INFO] - CONTATO " + nome + ", NÃO EXISTE NA AGENDA");
            }
        }
    }

}
