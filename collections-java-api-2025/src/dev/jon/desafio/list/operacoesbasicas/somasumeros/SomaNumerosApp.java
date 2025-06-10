package dev.jon.desafio.list.operacoesbasicas.somasumeros;

public class SomaNumerosApp {
    public static void main(String[] args) {
        SomaNumeros listNumerosInteiros = new SomaNumeros();

        listNumerosInteiros.adicionarNumero(5);
        listNumerosInteiros.adicionarNumero(2);
        listNumerosInteiros.adicionarNumero(10);
        listNumerosInteiros.adicionarNumero(8);
        listNumerosInteiros.adicionarNumero(1);

        System.out.println("Função Calcula Soma:");
        System.out.println(listNumerosInteiros.calcularSoma());

        System.out.println("Função Encontra MAIOR Número:");
        System.out.println(listNumerosInteiros.encontrarMaiorNumero());

        System.out.println("Função Encontra MENOR Número:");
        System.out.println(listNumerosInteiros.encontrarMenorNumero());

        System.out.println("\nLista de Números: " + listNumerosInteiros.exibirNumeros());
    }
}
