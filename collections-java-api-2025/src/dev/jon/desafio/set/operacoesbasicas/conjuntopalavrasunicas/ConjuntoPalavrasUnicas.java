package dev.jon.desafio.set.operacoesbasicas.conjuntopalavrasunicas;

import java.util.HashSet;
import java.util.Objects;

public class ConjuntoPalavrasUnicas {
    private final HashSet<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            boolean findPlavraUnica = false;
            for (String palavraUnica : palavrasUnicas) {
                if (palavraUnica.equals(palavra)) {
                    palavrasUnicas.remove(palavra);
                    findPlavraUnica = true;
                    break;
                }
            }

            if(findPlavraUnica) {
                System.out.println("[DEBUG] - Palavra " + palavra + " removida com sucesso");
            }else {
                System.out.println("[INFO] - Não existe a palavra " + palavra + " no conjunto de palavras unicas.");
            }
        }else {
            System.out.println("[INFO] - Não é possivel remover a palavra " + palavra + ", pois o conjunto está vazio");
        }
    }

    public void verificarPalavra(String palavra) {
        if(palavrasUnicas.contains(palavra)) {
            System.out.println("[DEBUG] - A Palavra " + palavra + " está no conjunto");
        }else {
            System.out.println("[INFO] - A Palavra " + palavra + " NÃO está no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    public void tamanhoDoConjunto(){
        System.out.println(palavrasUnicas.size());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicas);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicas +
                '}';
    }
}
