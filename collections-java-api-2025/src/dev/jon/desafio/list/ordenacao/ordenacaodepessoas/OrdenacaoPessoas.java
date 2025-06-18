package dev.jon.desafio.list.ordenacao.ordenacaodepessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        Collections.sort(pessoasList);
    }

    public void ordenarPorAltura(){
        Collections.sort(pessoasList, new CompararPorAltura());
    }

    public void exibirPessoas(){
        System.out.println(pessoasList);
    }

}
