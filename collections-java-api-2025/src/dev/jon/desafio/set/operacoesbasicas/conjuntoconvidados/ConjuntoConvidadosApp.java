package dev.jon.desafio.set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidadosApp {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Jonatas Oliveira", 1);
        conjuntoConvidados.adicionarConvidado("Carla Rafaela", 2);
        conjuntoConvidados.adicionarConvidado("José Carlos", 3);
        conjuntoConvidados.adicionarConvidado("Joana", 4);

        System.out.println("TODOS OS CONVIDADOS DO CONJUNTO");
        conjuntoConvidados.exibirConvidados();

    }
}
