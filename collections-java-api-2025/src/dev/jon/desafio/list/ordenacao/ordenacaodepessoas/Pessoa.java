package dev.jon.desafio.list.ordenacao.ordenacaodepessoas;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
}
