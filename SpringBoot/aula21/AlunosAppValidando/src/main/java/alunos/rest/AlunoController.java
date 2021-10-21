package alunos.rest;

import alunos.model.entity.Aluno;
import alunos.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoRepository repository;

    @Autowired
    public AlunoController(AlunoRepository   repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno salvar(@Valid @RequestBody Aluno aluno){
        return repository.save(aluno);
    }

    @GetMapping("{id}")
    public Aluno acharPorId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Aluno"+id+" não cadastrado!"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository
                .findById(id)
                .map(aluno -> {
                    repository.delete(aluno);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Aluno"+id+" não cadastrado!"));

    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @Valid @RequestBody Aluno AlunoAtualizado){
        repository
            .findById(id)
            .map(aluno -> {
                aluno.setNome(AlunoAtualizado.getNome());
                aluno.setIdade(AlunoAtualizado.getIdade());
                aluno.setNumero(AlunoAtualizado.getNumero());
                aluno.setRua(AlunoAtualizado.getRua());
                aluno.setCep(AlunoAtualizado.getCep());
                aluno.setBairro(AlunoAtualizado.getBairro());
                aluno.setCidade(AlunoAtualizado.getCidade());
                aluno.setUf(AlunoAtualizado.getUf());
                return repository;
            }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
