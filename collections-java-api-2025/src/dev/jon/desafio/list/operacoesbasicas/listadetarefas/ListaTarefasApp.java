package dev.jon.desafio.list.operacoesbasicas.listadetarefas;

public class ListaTarefasApp {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("Número total de elementos na lista: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar Spring Boot");
        lista.adicionarTarefa("Estudar Python");

        System.out.println("Número total de elementos na lista: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Estudar Java");

        System.out.println("Número total de elementos na lista: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();

    }
}
