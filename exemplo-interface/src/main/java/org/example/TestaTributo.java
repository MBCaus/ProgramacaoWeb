package org.example;

public class TestaTributo {
    public static void main(String[] args) {

        Alimento alimento = new Alimento(55, "Mandioca", 15.50, 88);
        Perfume perfume = new Perfume(22, "Malboro, sinta na pele o cheiro de fumante", 880.90, "Cigarro Malboro");
        Servico servico = new Servico("Plantar Mandioca e fazer perfume de cigarro Malboro", 3_500.0);

        Tributo tributo = new Tributo();

        tributo.adicionaTributavel(alimento);
        tributo.adicionaTributavel(perfume);
        tributo.adicionaTributavel(servico);

        tributo.exibeTodos();

        tributo.exibeTotal();

    }
}