package sptech.school.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contador")
public class ContadorController {

    private int contador;

    @GetMapping()
    public String contar(){
        contador++;
        return String.format("O contador está em: %d", contador);
    }

}
