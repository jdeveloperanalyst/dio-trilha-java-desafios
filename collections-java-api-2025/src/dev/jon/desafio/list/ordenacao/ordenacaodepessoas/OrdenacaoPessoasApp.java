package dev.jon.desafio.list.ordenacao.ordenacaodepessoas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoasApp {
    public static void main(String[] args) {
        OrdenacaoPessoas listPessoas = new OrdenacaoPessoas();

        listPessoas.adicionarPessoa("Jonatas", 32, 1.65);
        listPessoas.adicionarPessoa("Rafaela", 26, 1.58);
        listPessoas.adicionarPessoa("Carlos", 60, 1.64);

        System.out.println("\nTODAS AS PESSOAS:");
        listPessoas.exibirPessoas();

        System.out.println("\nORDENANDO POR IDADE:");
        listPessoas.ordenarPorIdade();
        listPessoas.exibirPessoas();


    }


}
