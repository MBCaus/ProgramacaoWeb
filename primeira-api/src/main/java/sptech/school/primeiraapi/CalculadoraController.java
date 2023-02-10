package sptech.school.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoras")
public class CalculadoraController {

    @GetMapping("/somar/{numero1}/{numero2}")
    public String somar(@PathVariable int numero1, @PathVariable int numero2){
        return String.format("A soma é: %d", (numero1 + numero2));
    }

}
