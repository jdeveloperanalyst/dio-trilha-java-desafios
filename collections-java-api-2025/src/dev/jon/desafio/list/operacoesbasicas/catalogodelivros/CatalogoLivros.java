package dev.jon.desafio.list.operacoesbasicas.catalogodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        System.out.println("\nLivros relacionados ao autor: " + autor);
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(livro);
                }
            }
        }else {
            System.out.println("A lista de livros está vazia. Nenhum livro para pesquisar.");
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal) {
        System.out.println("\nLivros publicados entre " + anoInicial + " e " + anoFinal + ":");
        List<Livro> livroPorIntervalo = new ArrayList<>();
        boolean find = false;
        if(!listLivros.isEmpty()) {
            for(Livro livro : listLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervalo.add(livro);
                    find = true;
                }
            }

            if(!find){
                System.out.println("Nenhum livro foi encontrado no período entre " + anoInicial + " e " + anoFinal + ":");
            }
        }else {
            System.out.println("A lista de livros está vazia. Nenhum livro para pesquisar.");
        }
        return livroPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        System.out.println("\nPesquisa por titulo:");
        Livro livroPesquisaPorTitulo = null;
        if(!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPesquisaPorTitulo = livro;
                    break;
                }
            }

            if(livroPesquisaPorTitulo == null) {
                System.out.println("Nenhum livro encontrado com o título: " + titulo);
            }

        }else {
            System.out.println("A lista de livros está vazia. Nenhum livro para pesquisar.");
        }

        return livroPesquisaPorTitulo;
    }

    public void exibirCatalogo(){
        System.out.println("\nCATALOGO DE LIVROS");
        for(Livro livro : listLivros) {
            System.out.println(livro);
        }
    }

}
