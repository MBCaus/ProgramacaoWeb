package school.sptech.projeto2.projeto2api;

public class FrutaSimples {

    private String nome;
    private double preco;

    public FrutaSimples(Fruta fruta) {
        this.nome = fruta.getNome();
        this.preco = fruta.getPreco();
    }
}
