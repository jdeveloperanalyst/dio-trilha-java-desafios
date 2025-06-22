package dev.jon.desafio.set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidadosApp {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.adicionarConvidado("Jonatas Oliveira", 1);
        conjuntoConvidados.adicionarConvidado("Carla Rafaela", 2);
        conjuntoConvidados.adicionarConvidado("José Carlos", 3);
        conjuntoConvidados.adicionarConvidado("Homem Aranha", 4);

        System.out.println("\nTODOS OS CONVIDADOS DO CONJUNTO APÓS ADICIONAR CONVIDADOS");
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nTODOS OS CONVIDADOS DO CONJUNTO ATUALIZADO APÓS REMOVER CONVIDADO POR CÓDIGO");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nO CONJUNTO POSSUI O TOTAL DE " + conjuntoConvidados.contarConvidados() + " CONVIDADOS");


    }
}
