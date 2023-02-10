package sptech.school.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private List<String> lista;

    public PokemonController(List<String> lista) {
        this.lista = lista;
    }

    @GetMapping("/quantidade")
    public String listaSize() {

        return String.format("A quantidade de pokemon existentes é: %d", lista.size());

    }

    @GetMapping("/cadastrar/{pokemon}")
    public String cadastrarPokemon(@PathVariable String pokemon) {
        lista.add(pokemon);
        return "Pokemon cadastrado";
    }

    @GetMapping("/recuperar/{indice}")
    public String recuperarPokemon(@PathVariable int indice){
        if(indice >= lista.size()){
            return "Nenhum Pokemon encontrado";
        }else{
            return String.format("O pokemon recuperado é: %s", lista.get(indice));
        }
    }

}
