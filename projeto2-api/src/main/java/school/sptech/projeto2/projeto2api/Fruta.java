package school.sptech.projeto2.projeto2api;

public class Fruta {

    private String nome;
    private Double preco;
    private int qtd;
    private Boolean temSemente;

    public Fruta(){

    }

    public Fruta(String nome, Double preco, int qtd, Boolean temSemente) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.temSemente = temSemente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Boolean getTemSemente() {
        return temSemente;
    }

    public void setTemSemente(Boolean temSemente) {
        this.temSemente = temSemente;
    }

    public  String getPrecoDescricao(){
        return preco > 10 ? "Caro..." : "Ta no precinho!";
    }

}
