package sptech.school.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FrasesController {

    @GetMapping()
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/bom-dia")
    public String bomDia(){
        return "Bom dia";
    }

    @GetMapping("/boa-tarde")
    public String boaTarde(){
        return "Boa tarde";
    }

    @GetMapping("/boa-noite")
    public String boaNoite(){
        return "Boa Noite";
    }

}
