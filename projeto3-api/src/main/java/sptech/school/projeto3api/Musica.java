package sptech.school.projeto3api;

public class Musica {

    private String nome;
    private int anoLancamento;
    private Boolean nacional;

    public Musica(String nome, int anoLancamento, Boolean nacional) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nacional = nacional;
    }

    public Musica() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }
}
