package sptech.school.terceiraapi.boletin;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boletins")
public class BoletinController {

    List<BoletinAluno> notasAlunos = new ArrayList();

    @GetMapping
    public List<BoletinAluno> retornaBoletins(){
        if(notasAlunos != null){
            return notasAlunos;
        }
        return null;
    }

    @GetMapping("/{indice}")
    public BoletinAluno trazBoletin(@PathVariable int indice){
        return notasAlunos.get(indice);
    }

    @DeleteMapping("/{indice}")
    public String deletaBoletin(@PathVariable int indice){
                if(indice < notasAlunos.size() || indice > notasAlunos.size()){
                    notasAlunos.remove(indice);
                    return "Excluído";
                }else{
                    return "Deu ruim";
                }
    }

    @PostMapping()
    public BoletinAluno criaBoletin(@RequestBody BoletinAluno aluno){
        notasAlunos.add(aluno);
        return aluno;
    }

    @GetMapping("/contagem")
    public String qtdBoletins(){
        return String.format("O número de boletins cadastrados é: %d", notasAlunos.size());
    }

    @GetMapping("/melhores")
    public BoletinAluno retornaMelhores(){
        for (BoletinAluno alunos : notasAlunos) {
            if(alunos.getMedia() > 9.5){
                return alunos;
            }
        }
        return null;
    }

}
