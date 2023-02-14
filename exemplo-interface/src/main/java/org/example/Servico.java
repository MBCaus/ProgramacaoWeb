package org.example;

public class Servico implements Tributavel{

    private String descricaoi;
    private Double preco;

    public Servico(String descricaoi, Double preco) {
        this.descricaoi = descricaoi;
        this.preco = preco;
    }

    @Override
    public Double getValorTributo() {
        return preco*0.12;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricaoi='" + descricaoi + '\'' +
                ", preco=" + preco +
                '}';
    }
}
