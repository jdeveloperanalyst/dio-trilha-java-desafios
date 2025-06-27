package dev.jon.desafio.set.ordenacao.cadastrodeproduto;

public class CadastroProdutosApp {
    public static void main(String[] args) {
        CadastroProdutos cadastroProduto = new CadastroProdutos();

        System.out.println("CADASTRANDO PRODUTOS");
        cadastroProduto.adicionarProduto(1L, "Notebook", 3500.00, 10);
        cadastroProduto.adicionarProduto(2L, "Mouse", 120.50, 50);
        cadastroProduto.adicionarProduto(3L, "Teclado", 200.00, 30);
        cadastroProduto.adicionarProduto(4L, "Apontador", 3.50, 5);

        System.out.println("\nPRODUTOS ORDENADOS POR NOME");
        cadastroProduto.exibirProdutosPorNome();

        System.out.println("\nPRODUTOS ORDENADOS POR PREÇO");
        cadastroProduto.exibirProdutosPorPreco();

        System.out.println("\nEXIBINDO PRODUTOS");
        cadastroProduto.exibirProdutos();
    }
}
