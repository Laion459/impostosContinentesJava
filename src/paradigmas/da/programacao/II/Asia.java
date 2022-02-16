package paradigmas.da.programacao.II;

import java.util.Objects;

public class Asia {
    private String nome;
    private Integer populacao;

    public Asia(String nome, Integer populacao) {
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
        return "Asia{" +
                "nome='" + nome + '\'' +
                ", populacao='" + populacao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asia)) return false;
        Asia asia = (Asia) o;
        return Objects.equals(getNome(), asia.getNome()) && Objects.equals(getPopulacao(), asia.getPopulacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPopulacao());
    }
}
