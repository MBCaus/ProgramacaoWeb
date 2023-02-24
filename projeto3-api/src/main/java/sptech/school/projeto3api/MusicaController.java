package sptech.school.projeto3api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private List<Musica> musicas;

    public MusicaController() {
        this.musicas = new ArrayList();
        this.musicas.add(new Musica("Trem das onze", 1964, true));
        this.musicas.add(new Musica("Banho de Lua", 1995, true));
        this.musicas.add(new Musica("Borboletas", 2004, true));
    }

    @RequestMapping
    public List<Musica> listar(){
        return musicas;
    }

    @RequestMapping("/{indice}")
    public Musica buscarPorIndice(@PathVariable int indice){
        if(indice >= 0 && indice < musicas.size()){
            return musicas.get(indice);
        }
        return null;
    }

    @DeleteMapping("/{indice}")
    public Musica removerPorIndice(@PathVariable int indice){
        if(indice >= 0 && indice < musicas.size()){
            return musicas.remove(indice);
        }
        return null;
    }

    @PostMapping()
    public Musica cadastrar(@RequestBody Musica novaMusica){
        this.musicas.add(novaMusica);
        return novaMusica;
    }

    @PutMapping("/{indice}")
    public Musica atualiza(@PathVariable int indice, @RequestBody Musica atualizarMusica){
        if(indice >= 0 && indice < musicas.size()){
            this.musicas.set(indice, atualizarMusica);
            return atualizarMusica;
        }
        return null;
    }

}
