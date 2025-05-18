package dev.jon.desafio.aplicativos;


import dev.jon.desafio.aplicativos.recursos.apps.ReprodutorMusical;

public class Musica implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("[App Música] TOCANDO MUSICA...");
    }

    @Override
    public void pausar() {
        System.out.println("[App Música] PAUSANDO MUSICA...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("[App Música] SELECIONANDO MUSICA...");
    }
}
