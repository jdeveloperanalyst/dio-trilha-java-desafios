package dev.jon.desafio.set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoPararemover = null;
        for(Convidado convidado : convidadosSet) {
            if(convidado.getCodigoConvite() == codigoConvite) {
                convidadoPararemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoPararemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        if(!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        }else {
            System.out.println("NÃO EXISTE CONVIDADOS NO MOMENTO");
        }
    }
}
