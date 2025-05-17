package dev.jon.desafio.aplicativos;

import dev.jon.desafio.aplicativos.recursos.apps.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void fazerChamada() {
        System.out.println("FAZENDO CHAMADA");
    }

    @Override
    public void atenderChamada() {
        System.out.println("ATENDENDO CHAMADA");
    }
}
