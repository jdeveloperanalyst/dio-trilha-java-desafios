package dev.jon.desafio.celular;

import dev.jon.desafio.aplicativos.Musica;
import dev.jon.desafio.aplicativos.recursos.apps.ReprodutorMusical;

public class Iphone {
    private final ReprodutorMusical musica;

    public Iphone(ReprodutorMusical musica){
        this.musica = musica;
    }

    public void tocarMusica(){
        musica.tocar();
    }

    public void pausarMusica(){
        musica.pausar();
    }

    public void selecionarMusica(){
        musica.selecionarMusica();
    }

}
