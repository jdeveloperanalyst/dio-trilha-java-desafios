package dev.jon.desafio.set.ordenacao.cadastrodeproduto;

public class Produto implements Comparable<Produto>{
    private final String nome;
    private final long cod;
    private final double preco;
    private final int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareTo(produto.nome);
    }



    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "{nome=" + nome +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +"}";
    }
}
