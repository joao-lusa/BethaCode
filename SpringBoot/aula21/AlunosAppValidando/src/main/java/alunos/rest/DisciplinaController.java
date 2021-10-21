package alunos.rest;

import alunos.model.entity.Diciplina;
import alunos.model.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("{id}")
    public Diciplina acharPorId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não cadastrada!"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(diciplina -> {
                    repository.delete(diciplina);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não encontrada"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @Valid @RequestBody Diciplina dadoAtulizado){
        repository
                .findById(id)
                .map(diciplina -> {
                    diciplina.setDescricao(dadoAtulizado.getDescricao());
                    diciplina.setNumeroHoras(dadoAtulizado.getNumeroHoras());
                    return repository.save(diciplina);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não cadastrada!"));
    }
}
