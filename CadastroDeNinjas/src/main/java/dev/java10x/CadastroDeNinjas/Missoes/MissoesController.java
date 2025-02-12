package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Mandar uma requisição pra MOSTRAR as missões
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso";
    }

    // POST -- Mandar uma requisição para CRIAR as missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    // PUT -- Mandar uma requisição para ALTERAR as missões
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterado com sucesso";
    }

    // POST -- Mandar uma requisição para DELETAR as missões
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }

}
