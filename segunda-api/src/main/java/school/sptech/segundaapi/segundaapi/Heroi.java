package school.sptech.segundaapi.segundaapi;

public class Heroi {

    private String nome;
    private String habilidade;
    private int idade;
    private double forca;
    private Boolean vivo;

    public Heroi(String nome, String habilidade, int idade, double forca, Boolean vivo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.forca = forca;
        this.vivo = vivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
