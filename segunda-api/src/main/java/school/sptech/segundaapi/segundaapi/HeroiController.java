package school.sptech.segundaapi.segundaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/heroi")
public class HeroiController {

    private List<Heroi> herois = new ArrayList();

    @GetMapping
    public List<Heroi> heroisCadastrados(){
        return herois;
    }

    @GetMapping("/recuperar/{indice}")
    public Heroi recuperarHeroi(@PathVariable int indice){
        if(indice < 0 || indice > herois.size()){
            return null;
        }else{
            return herois.get(indice);
        }
    }

    @GetMapping("/cadastrar/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public String cadastrarHeroi(@PathVariable String nome, @PathVariable String habilidade, @PathVariable int idade, @PathVariable double forca, @PathVariable Boolean vivo){
        herois.add(new Heroi(nome, habilidade, idade, forca, vivo));
        return "Herói cadastrado!";
    }

    @GetMapping("/atualizar/{indice}/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public String atuaçlizarHeroi(@PathVariable int indice, @PathVariable String nome, @PathVariable String habilidade, @PathVariable int idade, @PathVariable double forca, @PathVariable Boolean vivo){
        if(indice < 0 || indice > herois.size()){
            return "Indice Invalido";
        }else{
            herois.set(indice, new Heroi(nome, habilidade, idade, forca, vivo));
            return "Heroi atualizado";
        }
    }

    @GetMapping("/remover/{indice}")
    public String removerHeroi(@PathVariable int indice){
        if(indice < 0 || indice > herois.size()){
            return "Indice Invalido";
        }else{
            herois.remove(indice);
            return "Heroi removido";
        }
    }

    @GetMapping("/consulta/{nome}")
    public List<Heroi> consultarHeroi(@PathVariable String nome){
        List<Heroi> heroisFiltrados = new ArrayList();

        for (Heroi heroi : herois) {
            if(heroi.getNome().contains(nome)){
                heroisFiltrados.add(heroi);
            }
        }

        return heroisFiltrados;
    }
}
