package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTrib;

    public Tributo() {
        this.listaTrib = new ArrayList();
    }

    public void adicionaTributavel(Tributavel tributavel){
        listaTrib.add(tributavel);
    }

    public void exibeTodos(){
        for (Tributavel tributo : listaTrib) {
            System.out.println(tributo);
        }
    }

    public Double calculaTotalTributo(){

        Double valorTotal = 0.0;

        for (Tributavel tributo : listaTrib) {
            valorTotal += tributo.getValorTributo();
        }

        return valorTotal;

    }

    public void exibeTotal(){
        System.out.println(calculaTotalTributo());
    }

    @Override
    public String toString() {
        return "Tributo{" +
                "listaTrib=" + listaTrib +
                '}';
    }
}
