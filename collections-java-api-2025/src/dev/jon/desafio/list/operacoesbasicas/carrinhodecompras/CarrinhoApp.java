package dev.jon.desafio.list.operacoesbasicas.carrinhodecompras;

import dev.jon.desafio.list.operacoesbasicas.listadetarefas.ListaTarefas;

public class CarrinhoApp {
    public static void main(String[] args) {
        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();

        listaCompras.adicionarItem("Chocolate", 7.40, 1);

        listaCompras.exibirItens();
    }
}
