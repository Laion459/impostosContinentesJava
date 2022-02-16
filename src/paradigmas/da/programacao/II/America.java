package paradigmas.da.programacao.II;

import java.util.Objects;

public class America {
    private String nome;
    private Integer populacao;

    public America(String nome, Integer populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "America{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof America)) return false;
        America america = (America) o;
        return getNome().equals(america.getNome()) && getPopulacao().equals(america.getPopulacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPopulacao());
    }
}
