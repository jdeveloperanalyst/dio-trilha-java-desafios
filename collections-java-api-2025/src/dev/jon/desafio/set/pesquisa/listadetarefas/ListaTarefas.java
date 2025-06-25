package dev.jon.desafio.set.pesquisa.listadetarefas;

import java.util.HashSet;

public class ListaTarefas {
    private HashSet<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!listaTarefa.isEmpty()) {
            boolean findTask = false;
            for(Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    findTask = true;
                    System.out.println("[DEBUG] - Removendo tarefa " + descricao + " da lista");
                    listaTarefa.remove(tarefa);
                    break;
                }
            }

            if(!findTask) {
                System.out.println("[INFO] - tarefa " + descricao + " não existe na lista");
            }
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefa);
    }

    public void contarTarefas() {
        if(!listaTarefa.isEmpty()) {
            System.out.println("A lista possui " + listaTarefa.size() + " tarefas");
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void obterTarefasConcluidas() {
        if(!listaTarefa.isEmpty()) {
            HashSet<Tarefa> tarefasConcluidas = new HashSet<>();
            for(Tarefa tarefa : listaTarefa) {
                if(tarefa.isCheck()) {
                    tarefasConcluidas.add(tarefa);
                }
            }
            System.out.println(tarefasConcluidas);
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void obterTarefasPendentes() {
        if(!listaTarefa.isEmpty()) {
            HashSet<Tarefa> tarefasPendentes = new HashSet<>();
            for(Tarefa tarefa : listaTarefa) {
                if(!tarefa.isCheck()) {
                    tarefasPendentes.add(tarefa);
                }
            }
            System.out.println(tarefasPendentes);
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!listaTarefa.isEmpty()) {
            boolean findTarefa = false;
            for(Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescricao().equals(descricao)) {
                    findTarefa = true;
                    System.out.println("Marcando tarefa " + descricao + " como CONCLUÍDA");
                    tarefa.setCheck(true);
                    break;
                }
            }
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if(!listaTarefa.isEmpty()) {
            boolean findTarefa = false;
            for(Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescricao().equals(descricao)) {
                    findTarefa = true;
                    System.out.println("Marcando tarefa " + descricao + " como PENDENTE");
                    tarefa.setCheck(false);
                    break;
                }
            }
        }else {
            System.out.println("[INFO] - Lista de tarefas vazia");
        }
    }

    public void limparListaTarefas() {
        listaTarefa.clear();
    }
}
