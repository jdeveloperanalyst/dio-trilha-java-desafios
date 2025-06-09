package dev.jon.desafio.list.operacoesbasicas.somasumerosinteiros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteirosList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numerosInteirosList.add(numero);
    }

    public void calcularSoma() {
        if (!numerosInteirosList.isEmpty()) {
            int soma = 0;
            for (int num : numerosInteirosList) {
                soma += num;
            }
            System.out.println("Soma dos números: " + soma);
        } else {
            System.out.println("A lista está vazia. Nada para somar.");
        }
    }



}
