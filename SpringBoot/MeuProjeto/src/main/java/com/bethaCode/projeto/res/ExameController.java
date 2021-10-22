package com.bethaCode.projeto.res;

import com.bethaCode.projeto.model.entity.Exame;
import com.bethaCode.projeto.model.repository.ExamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/exames")
public class ExameController {

    private final ExamesRepository repository;

    @Autowired
    public ExameController(ExamesRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Exame salvar(@Valid @RequestBody Exame exame){
        return repository.save(exame);
    }

    @GetMapping("{id}")
    public Exame acharId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Exame "+id+" não foi cadastrado"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(exame -> {
                    repository.delete(exame);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Exame "+id+" Não foi cadastrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @Valid @RequestBody Exame dadoAtualizado){
        repository
                .findById(id)
                .map(exame -> {
                    exame.setNome(dadoAtualizado.getNome());
                    exame.setValor(dadoAtualizado.getValor());
                    exame.setSigla(dadoAtualizado.getSigla());
                    exame.setJejum(dadoAtualizado.getJejum());
                    return repository.save(exame);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Exame "+id+" não foi cadastrado"));
    }
}
