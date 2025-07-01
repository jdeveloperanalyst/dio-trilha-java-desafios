package dev.jon.desafio.set.ordenacao.listadealunos;

public class GerenciadorAlunosApp {
    public static void main(String[] args) {
        GerenciadorAlunos alunosList = new GerenciadorAlunos();

        System.out.println("Conjunto Inicio");
        alunosList.exibirAlunos();

        alunosList.adicionarAluno("Joao", 1L, 8.1);
        alunosList.adicionarAluno("Maria", 2L, 5.2);
        alunosList.adicionarAluno("Maria", 2L, 7.2);
        alunosList.adicionarAluno("Jose", 3L, 9.0);
        alunosList.adicionarAluno("Jose", 4L, 4.5);

        System.out.println("\nExibe todos os alunos do conjunto");
        alunosList.exibirAlunos();
    }
}
