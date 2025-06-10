package dev.jon.desafio.list.pesquisa.somasumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteirosList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numerosInteirosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosInteirosList.isEmpty()) {
            for (int num : numerosInteirosList) {
                soma += num;
            }
        } else {
            System.out.println("A lista está vazia. Nada para somar.");
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        if (!numerosInteirosList.isEmpty()) {
            maior = numerosInteirosList.getFirst();
            for (int num : numerosInteirosList) {
                if(num > maior){
                    maior = num;
                }
            }
        } else {
            System.out.println("A lista de numeros está vazia.");
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 0;
        if (!numerosInteirosList.isEmpty()) {
            menor = numerosInteirosList.getFirst();
            for (int num : numerosInteirosList) {
                if(num < menor){
                    menor = num;
                }
            }
        } else {
            System.out.println("A lista de numeros está vazia.");
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numerosInteirosList;
    }

}
