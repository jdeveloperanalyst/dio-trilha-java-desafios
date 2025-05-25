package dev.jon.desafio.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaCompas;

    public CarrinhoDeCompras() {
        this.listaCompas = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        for(Item i : listaCompas){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaCompas.set(2, i + 1);
            }else{
                listaCompas.add(new Item(nome, preco, quantidade));
            }
        }
    }

    public void removerItem(String nome, int quantidade){

    }

    public void exibirItens(){
        System.out.println(listaCompas);
    }
}
