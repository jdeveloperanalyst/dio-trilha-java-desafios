package dev.jon.desafio.list.operacoesbasicas.carrinhodecompras;

import dev.jon.desafio.list.operacoesbasicas.listadetarefas.ListaTarefas;

public class CarrinhoApp {
    public static void main(String[] args) {
        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();

        listaCompras.adicionarItem("Chocolate", 7.40, 1);
        listaCompras.adicionarItem("Açucar", 5.70, 1);
        listaCompras.adicionarItem("Café", 36.90, 2);

        listaCompras.exibirItens();

        listaCompras.removerItem("Açucar");

        listaCompras.calcularValorTotal();

        listaCompras.exibirItens();

    }
}
