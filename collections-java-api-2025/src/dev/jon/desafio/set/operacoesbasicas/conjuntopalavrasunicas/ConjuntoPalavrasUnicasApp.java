package dev.jon.desafio.set.operacoesbasicas.conjuntopalavrasunicas;

public class ConjuntoPalavrasUnicasApp {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        System.out.println("TAMANHO DO CONJUNTO ATUAL");
        palavrasUnicas.tamanhoDoConjunto();

        System.out.println("\nADICIONANDO PALAVRAS UNICAS AO CONJUNTO");
        palavrasUnicas.adicionarPalavra("PORTA");
        palavrasUnicas.adicionarPalavra("Porta");
        palavrasUnicas.adicionarPalavra("PORTA");
        palavrasUnicas.adicionarPalavra("Carro");
        palavrasUnicas.adicionarPalavra("CarrO");
        palavrasUnicas.adicionarPalavra("CarrO");
        palavrasUnicas.adicionarPalavra("CARRO");

        System.out.println("\nREMOVENDO PALAVRAS UNICAS AO CONJUNTO");
        palavrasUnicas.removerPalavra("Carro");
        palavrasUnicas.removerPalavra("CarrU");

        System.out.println("\nVERIFICANDO SE UMA PALAVRA ESTÁ NO CONJUNTO");
        palavrasUnicas.verificarPalavra("CarrIn");
        palavrasUnicas.verificarPalavra("PORTA");


        System.out.println("\nEXIBINDO PALAVRAS UNICAS DO CONJUNTO");
        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\n" + palavrasUnicas);
    }

}
