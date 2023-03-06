package sptech.school.terceiraapi.produto;

public class ProdutoDTO {

    private String nome;
    private double preco;

    public ProdutoDTO(Produto produto) {
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
