package paradigmas.da.programacao.II;

import java.util.Objects;

public class CalculadoraImposto{
    private Float preco;
    private String nome;
    private Somatorio soma;

    // Médtodos especiais

    public CalculadoraImposto(Float preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    // Métodos privados


    public Somatorio getSoma() {
        return soma;
    }

    public void setSoma(Somatorio soma) {
        this.soma = soma;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CalculadoraImposto{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
    // Métodos públicos
    /**
     calcula imposto() recebe
     @parametro continente recebe nome localisação para definir carga a ser multiplicada
     @parametro preco recebe a porsetagem a ser aplicada ao preco
     @return preco com valor multiplicado
     */
    public double calculaImposto(String continente, double preco){

        if (continente == "América"){
            preco = preco * 1.10;
        }

        if (continente == "Asia"){
            preco = preco * 1.15;
        }

        if (continente == "Europa"){
            preco = preco * 1.20;
        }
        return preco;
    }
}
