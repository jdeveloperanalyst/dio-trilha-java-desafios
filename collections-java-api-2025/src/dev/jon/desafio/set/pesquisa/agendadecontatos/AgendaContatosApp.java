package dev.jon.desafio.set.pesquisa.agendadecontatos;

public class AgendaContatosApp {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("AGENDA ATUAL");
        agendaContatos.exibirContatos();

        System.out.println("\nADICIONANDO CONTATO A AGENDA");
        agendaContatos.adicionarContato("Pedro", 111111111);
        agendaContatos.adicionarContato("Maria", 222222222);

        System.out.println("\nPESQUISANDO NOME NA AGENDA");
        agendaContatos.pesquisarPorNome("Maria");
        agendaContatos.pesquisarPorNome("João");

        System.out.println("\nAGENDA ATUAL");
        agendaContatos.exibirContatos();

        System.out.println("\nATUALIZADO O CONTATO NA AGENDA COM NOVO NÚMERO");
        agendaContatos.atualizarNumeroContato("Pedro", 121212121);
        agendaContatos.atualizarNumeroContato("João", 131313131);

        System.out.println("\nAGENDA ATUAL");
        agendaContatos.exibirContatos();
    }

}
