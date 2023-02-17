package school.sptech.projeto2.projeto2api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {

    private List<Fruta> frutas = new ArrayList();

    @RequestMapping("/favorita")
    public Fruta getFavorita(){

        return new Fruta("Uva", 15.0, 20, false);

    }

    @GetMapping
    public List<Fruta> listar(){
        return frutas;
    }

    @GetMapping("/cadastrar/{nome}/{preco}/{qtd}/{temSemente}")
    public Fruta cadastrarFruta(@PathVariable String nome, @PathVariable double preco, @PathVariable int qtd, @PathVariable Boolean temSemente){
        Fruta novaFruta = new Fruta(nome, preco, qtd, temSemente);
        frutas.add(novaFruta);
        return novaFruta;
    }

    @GetMapping("/recuperar/{indice}")
    public Fruta recuperarIndice(@PathVariable int indice){

        if(indice > frutas.size() || indice < 0){
            return null;
        } else {
            return frutas.get(indice);
        }

    }

    @GetMapping("/atualizar/{indice}/{nome}/{preco}/{qtd}/{temSemente}")
    public Fruta atualizarFruta(@PathVariable int indice, @PathVariable String nome, @PathVariable double preco, @PathVariable int qtd, @PathVariable Boolean temSemente){
        if(indice > frutas.size() || indice < 0){
            return null;
        } else {
            frutas.set(indice, new Fruta(nome, preco, qtd, temSemente));
            return frutas.get(indice);
        }
    }

    @GetMapping("/remover/{indice}")
    public String removerFruta(@PathVariable int indice){

        if(indice > frutas.size() || indice < 0){
            return "Indice Invalido";
        } else {
            frutas.remove(indice);
            return "Fruta removida";
        }


    }



}
