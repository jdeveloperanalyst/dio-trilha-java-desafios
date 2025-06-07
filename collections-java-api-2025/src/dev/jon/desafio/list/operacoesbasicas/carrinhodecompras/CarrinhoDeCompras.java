package dev.jon.desafio.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        for (int i = 0; i < listaCompras.size(); i++){
            Item item = listaCompras.get(i);
            if (item.getNome().equalsIgnoreCase(nome)) {
                int novaQuantidade = item.getQuantidade() + quantidade;
                listaCompras.set(i, new Item(nome, preco, novaQuantidade));
                return;
            }
        }
        listaCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for (int i = 0; i < listaCompras.size(); i++) {
            Item item = listaCompras.get(i);
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaCompras.remove(item);
                return;
            }
        }
    }

    public void calcularValorTotal(){
        List<Float> listaValores = new ArrayList<>();
        for (Item item : listaCompras) {
            float valores = (float) item.getPreco() * item.getQuantidade();
            listaValores.add(valores);
        }
        float valorTotal = 0f;
        for (Float valor : listaValores) {
            valorTotal += valor;
        }
        System.out.printf("Valor Total R$%.2f %n", valorTotal);
    }

    public void exibirItens(){
        System.out.println(listaCompras);
    }
}
