package dev.jon.desafio.set.ordenacao.listadealunos;
import java.util.Comparator;

public class ComparadorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
