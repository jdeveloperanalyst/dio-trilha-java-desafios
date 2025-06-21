package dev.jon.desafio.set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void exibirConvidados(){
        for(Convidado nome : convidadosSet){
            System.out.println(nome.getNome());
        }
    }
}
