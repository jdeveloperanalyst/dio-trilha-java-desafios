package dev.jon.desafio.usuario;

import dev.jon.desafio.aplicativos.Musica;
import dev.jon.desafio.celular.Iphone;

public class Jonatas {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Iphone iphoneXsMax = new Iphone(musica);

        System.out.println("Abrindo App Música =D");
        iphoneXsMax.tocarMusica();
    }
}
