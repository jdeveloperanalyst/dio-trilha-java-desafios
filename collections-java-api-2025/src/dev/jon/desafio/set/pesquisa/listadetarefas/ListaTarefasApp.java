package dev.jon.desafio.set.pesquisa.listadetarefas;

public class ListaTarefasApp {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("LISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

        System.out.println("\nADICIONANDO TAREFAS NA LISTA");
        listaTarefas.adicionarTarefa("Fazer Café");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Fazer Compras");

        System.out.println("\nLISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

        System.out.println("\nREMOVENDO TAREFAS DA LISTA");
        listaTarefas.removerTarefa("Fazer Café");

        System.out.println("\nLISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

        System.out.println("\nCONTANDO TAREFAS DA LISTA");
        listaTarefas.contarTarefas();

        System.out.println("\nMOSTRANDO TAREFAS PENDENTES");
        listaTarefas.obterTarefasPendentes();

        System.out.println("\nMOSTRANDO TAREFAS CONCLUIDAS");
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.marcarTarefaConcluida("Fazer Compras");


        System.out.println("\nMARCANDO TAREFA COMO CONCLUIDA");

        System.out.println("\nLISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

        System.out.println("\nMARCANDO TAREFA COMO PENDENTE");
        listaTarefas.marcarTarefaPendente("Fazer Compras");

        System.out.println("\nLISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

        System.out.println("\nLIMPANDO LISTA DE TAREFAS");
        listaTarefas.limparListaTarefas();

        System.out.println("\nLISTA DE TAREFA ATUAL");
        listaTarefas.exibirTarefas();

    }
}