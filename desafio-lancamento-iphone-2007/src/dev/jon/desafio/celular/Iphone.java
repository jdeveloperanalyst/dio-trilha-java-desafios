package dev.jon.desafio.celular;

import dev.jon.desafio.aplicativos.Musica;
import dev.jon.desafio.aplicativos.recursos.apps.AparelhoTelefonico;
import dev.jon.desafio.aplicativos.recursos.apps.NavegadorInternet;
import dev.jon.desafio.aplicativos.recursos.apps.ReprodutorMusical;

public class Iphone {
    private final ReprodutorMusical appMusica;
    private final AparelhoTelefonico appTelefone;
    private final NavegadorInternet appNavegador;

    public Iphone(ReprodutorMusical appMusica, AparelhoTelefonico appTelefone, NavegadorInternet appNavegador){
        this.appMusica = appMusica;
        this.appTelefone = appTelefone;
        this.appNavegador = appNavegador;
    }

    public void tocarMusica(){
        appMusica.tocar();
    }

    public void pausarMusica(){
        appMusica.pausar();
    }

    public void selecionarMusica(){
        appMusica.selecionarMusica();
    }

    public void fazerChamada(){
        appTelefone.fazerChamada();
    }

    public void atenderChamada(){
        appTelefone.atenderChamada();
    }

    public void adicionarNovaAba(){
        appNavegador.adicionarNovaAba();
    }

    public void atualizarPagina(){
        appNavegador.atualizarPagina();
    }

}
