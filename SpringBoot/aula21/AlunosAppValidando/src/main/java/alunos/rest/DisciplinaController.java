package alunos.rest;

import alunos.model.entity.Diciplina;
import alunos.model.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/diciplinas")
public class DisciplinaController {
    private final DisciplinaRepository repository;

    @Autowired
    public DisciplinaController(DisciplinaRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Diciplina salvar(@Valid @RequestBody Diciplina disciplina){
        return repository.save(disciplina);
    }
}
