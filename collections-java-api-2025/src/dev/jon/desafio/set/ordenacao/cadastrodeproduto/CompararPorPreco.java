package dev.jon.desafio.set.ordenacao.cadastrodeproduto;

import java.util.Comparator;

public class CompararPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}
