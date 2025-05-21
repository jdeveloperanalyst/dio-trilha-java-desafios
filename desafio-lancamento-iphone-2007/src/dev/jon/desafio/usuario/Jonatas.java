package dev.jon.desafio.usuario;

import dev.jon.desafio.aplicativos.Musica;
import dev.jon.desafio.aplicativos.Safari;
import dev.jon.desafio.aplicativos.Telefone;
import dev.jon.desafio.celular.Iphone;

public class Jonatas {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Telefone telefone = new Telefone();
        Safari safari = new Safari();
        Iphone iphoneXsMax = new Iphone(musica, telefone, safari);

        System.out.println("Open App Música");
        iphoneXsMax.tocarMusica();
        iphoneXsMax.pausarMusica();
        iphoneXsMax.selecionarMusica();
        System.out.println("Close App Música");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Open App Ligação");
        iphoneXsMax.fazerChamada();
        iphoneXsMax.atenderChamada();
        System.out.println("Close App Ligação");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Open App Safari");
        iphoneXsMax.adicionarNovaAba();
        iphoneXsMax.atualizarPagina();
        System.out.println("Close App Safari");
    }
}
