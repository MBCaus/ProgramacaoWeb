package sptech.school.terceiraapi.produto;

public class Produto {

    private int id;
    private String nome;
    private String marca;
    private int qtdEstoque;
    private double preco;
    private boolean promocao;

    public Produto(String nome, String marca, int qtdEstoque, double preco, boolean promocao) {
        this.nome = nome;
        this.marca = marca;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
        this.promocao = promocao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
}
