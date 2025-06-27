package dev.jon.desafio.set.ordenacao.cadastrodeproduto;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> cadastroProdutos;

    public CadastroProdutos() {
        this.cadastroProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        List<Produto> listaOrdenada = new ArrayList<>(cadastroProdutos);
        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);
    }

    public void exibirProdutosPorPreco() {
        List<Produto> listaOrdenada = new ArrayList<>(cadastroProdutos);
        listaOrdenada.sort(new CompararPorPreco());
        System.out.println(listaOrdenada);
    }

    public void exibirProdutos() {
        System.out.println(cadastroProdutos);
    }
}
