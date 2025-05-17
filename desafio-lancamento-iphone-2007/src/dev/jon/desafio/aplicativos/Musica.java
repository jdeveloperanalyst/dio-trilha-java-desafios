package dev.jon.desafio.aplicativos;


import dev.jon.desafio.aplicativos.recursos.apps.ReprodutorMusical;

public class Musica implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("TOCANDO MUSICA");
    }
}
