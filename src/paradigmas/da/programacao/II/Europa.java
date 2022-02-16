package paradigmas.da.programacao.II;

import java.util.Objects;

public class Europa {
    private String nome;
    private Integer populacao;

    public Europa(String nome, Integer populacao) {
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
        return "Europa{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Europa)) return false;
        Europa europa = (Europa) o;
        return Objects.equals(getNome(), europa.getNome()) && Objects.equals(getPopulacao(), europa.getPopulacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPopulacao());
    }
}
