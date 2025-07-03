package dev.jon.desafio.set.ordenacao.listadealunos;

import dev.jon.desafio.set.ordenacao.cadastrodeproduto.Produto;

import java.util.*;

public class GerenciadorAlunos {
     Set<Aluno> alunosList;

    public GerenciadorAlunos() {
        this.alunosList = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosList.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        if(!alunosList.isEmpty()) {
            boolean findMatricula = false;
            for(Aluno aluno : alunosList) {
                if(aluno.getMatricula() == matricula) {
                    findMatricula = true;
                    alunosList.remove(aluno);
                    break;
                }
            }
        }else {
            System.out.println("[INFO] - Matricula inexistente - Conjunto vazio!");
        }
    }

    public void exibirAlunosPorNome() {
        List<Aluno> alunosPorNome = new ArrayList<>(alunosList);
        Collections.sort(alunosPorNome);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunos() {
        System.out.println(alunosList);
    }
}
