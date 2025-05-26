package dev.jon.desafio.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaCompas;

    public CarrinhoDeCompras() {
        this.listaCompas = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        for (int i = 0; i < listaCompas.size(); i++) {
            Item item = listaCompas.get(i);
            if (item.getNome().equalsIgnoreCase(nome)) {
                int novaQuantidade = item.getQuantidade() + quantidade;
                listaCompas.set(i, new Item(nome, preco, novaQuantidade));
                return;
            }
        }
        listaCompas.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, int quantidade){

    }

    public void exibirItens(){
        System.out.println(listaCompas);
    }
}
