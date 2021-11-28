package alunos.rest;

import alunos.model.entity.Disciplina;
import alunos.model.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/diciplinas")
@CrossOrigin("http://localhost:4200")
public class DisciplinaController {
    private final DisciplinaRepository repository;

    @Autowired
    public DisciplinaController(DisciplinaRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Disciplina salvar(@Valid @RequestBody Disciplina disciplina){
        return repository.save(disciplina);
    }

    @GetMapping
    public List<Disciplina> acharTodos(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Disciplina acharPorId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não cadastrada!"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(disciplina -> {
                    repository.delete(disciplina);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não encontrada"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @Valid @RequestBody Disciplina dadoAtulizado){
        repository
                .findById(id)
                .map(disciplina -> {
                    disciplina.setDescricao(dadoAtulizado.getDescricao());
                    disciplina.setNumeroHoras(dadoAtulizado.getNumeroHoras());
                    return repository.save(disciplina);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina "+id+" não cadastrada!"));
    }
}
