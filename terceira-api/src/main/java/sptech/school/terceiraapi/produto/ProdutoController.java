package sptech.school.terceiraapi.produto;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    List<Produto> produtos = new ArrayList();
    int indentificador = 1;

    @PostMapping
    public Produto adicionaProduto(@RequestBody Produto produto){
        produtos.add(produto);
        produto.setId(indentificador);
        indentificador++;
        return produto;
    }

    @GetMapping
    public List<Produto> exibeProdutos(){
        return produtos;
    }

    @GetMapping("/{indice}")
    public Produto retornaProduto(@PathVariable int indice){
        if(indice >= produtos.size()){
            return null;
        }else {
            return produtos.get(indice);
        }
    }

    @GetMapping("/promocao")
    public List<Produto> produtosPromocao(){
        return produtos.stream()
                .filter(produto -> produto.isPromocao())
                .collect(Collectors.toList());
    }

//    public List<Produto> produtosPromocao(){
//        List<Produto> produtosPromocao = new ArrayList();
//        for (Produto produto : produtos) {
//            if(produto.isPromocao() == true){
//                produtosPromocao.add(produto);
//                return produtosPromocao;
//            }
//        }
//        return produtos;
//    }

    @GetMapping("/total")
    public String retornaTotal(){
        double precoTotal = 0.0;
        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }
        return String.format("O total dos produtos é: %s", precoTotal);
    }

    @GetMapping("/valor/{valor}")
    public Produto valorMinimo(@PathVariable double valor){
        for (Produto produto : produtos) {
            if(produto.getPreco() <= valor){
                return produto;
            }
        }
        return null;
    }

    @GetMapping("/resumo")
    public List<ProdutoDTO> resumo(){
        List<ProdutoDTO> produtosResumo = new ArrayList();
        for (Produto produto : produtos) {
            produtosResumo.add(new ProdutoDTO(produto));
        }
        return produtosResumo;
    }

    @DeleteMapping("/{indice}")
    public String deletaProduto(@PathVariable int indice){
        if(indice >= produtos.size()){
            return "Produto de id: " + indice + " não encontrado";
        }else{
            produtos.remove(indice);
            return "Produto de id: " + indice + " excluido com sucesso!";
        }
    }

}
