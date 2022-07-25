package br.com.alura.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linguagens")
public class LinguagemController {

  @Autowired
  private LinguagemRepository repository;

  @GetMapping
  public List<Linguagem> obterLinguagens() {
    List<Linguagem> linguagens = repository.findAll();
    return linguagens;
  }

  @PostMapping
  public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
    Linguagem linguagemSalva = repository.save(linguagem);
    return linguagemSalva;
  }
}
