package dev.jon.desafio.list.pesquisa.catalogodelivros;

public class CatalogoApp {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Lei da Atração", "Michael J Losier", 2004);
        catalogoLivros.adicionarLivro("Imigrante Ilegal", "Raiam Santos", 2014);
        catalogoLivros.adicionarLivro("Primeiro Milhão", "Raiam Santos", 2023);
        catalogoLivros.adicionarLivro("Segundo Milhão", "Raiam Santos", 2025);
        catalogoLivros.adicionarLivro("Primeiro Milhão", "Elon Musk", 2006);

        System.out.println(catalogoLivros.pesquisarPorAutor("Raiam Santos"));

        System.out.println(catalogoLivros.pesquisarPorIntervalo(2006, 2023));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Primeiro Milhão"));

        catalogoLivros.exibirCatalogo();
    }
}
