package dev.jon.desafio.list.ordenacao.ordenacaodenumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numerosInteiros = new ArrayList<>();

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numerosInteiros);
    }

    public void ordenarDescendente(){
        Collections.sort(numerosInteiros.reversed());
    }

    @Override
    public String toString() {
        return "numerosInteiros = " + numerosInteiros;
    }
}
