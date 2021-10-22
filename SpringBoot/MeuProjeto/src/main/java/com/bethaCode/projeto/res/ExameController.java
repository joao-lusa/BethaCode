package com.bethaCode.projeto.res;

import com.bethaCode.projeto.model.entity.Exame;
import com.bethaCode.projeto.model.repository.ExamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/exames")
public class ExameController {

    private final ExamesRepository repository;

    @Autowired
    public ExameController(ExamesRepository repository){
        this.repository = repository;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Exame salvar(@Valid @RequestBody Exame exame){
        return repository.save(exame);
    }
}
