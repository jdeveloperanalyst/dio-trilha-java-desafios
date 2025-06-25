package dev.jon.desafio.set.pesquisa.listadetarefas;

public class Tarefa {
    private final String descricao;
    private boolean check;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", check=" + check +
                '}';
    }
}
