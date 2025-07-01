package dev.jon.desafio.set.ordenacao.listadealunos;

import java.util.HashSet;

public class GerenciadorAlunos {
    private HashSet<Aluno> alunosList;

    public GerenciadorAlunos() {
        this.alunosList = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosList.add(new Aluno(nome, matricula, media));
    }

    public void exibirAlunos() {
        System.out.println(alunosList);
    }
}
