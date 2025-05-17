package dev.jon.desafio.aplicativos;

import dev.jon.desafio.aplicativos.recursos.apps.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
}
