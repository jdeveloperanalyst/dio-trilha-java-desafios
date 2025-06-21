package dev.jon.desafio.list.ordenacao.ordenacaodenumeros;

public class OrdenacaoNumerosApp {
    public static void main(String[] args) {
        OrdenacaoNumeros listIntNumber = new OrdenacaoNumeros();

        System.out.println("LISTA DE NÚMEROS INTEIROS");
        System.out.println(listIntNumber);

        System.out.println("\nADD NÚMEROS INTEIROS");
        listIntNumber.adicionarNumero(3);
        listIntNumber.adicionarNumero(2);
        listIntNumber.adicionarNumero(1);
        System.out.println(listIntNumber);

        System.out.println("\nORDENANDO NÚMEROS INTEIROS ASCENDENTE");
        listIntNumber.ordenarAscendente();
        System.out.println(listIntNumber);

        System.out.println("\nORDENANDO NÚMEROS INTEIROS DESCENDENTE");
        listIntNumber.ordenarDescendente();
        System.out.println(listIntNumber);
    }
}
