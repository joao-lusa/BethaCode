package projeto.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import projeto.model.entity.Funcionario;
import projeto.model.repository.FuncionarioRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    private final FuncionarioRepository repository;

    @Autowired
    public FuncionarioController(FuncionarioRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Funcionario salvar(@Valid @RequestBody Funcionario funcionario){
        return repository.save(funcionario);
    }

    @GetMapping("{id}")
    public Funcionario acharPorId(@PathVariable Integer id){
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Funcionário "+id+" Não cadastrado"));
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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Funcionário "+id+" Não cadastrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @Valid @RequestBody Funcionario funcionarioAtualizado){
        repository
                .findById(id)
                .map(funcionario -> {
                    funcionario.setNome(funcionarioAtualizado.getNome());
                    funcionario.setEmail(funcionarioAtualizado.getEmail());
                    funcionario.setCidade(funcionarioAtualizado.getCidade());
                    funcionario.setTelefone(funcionarioAtualizado.getTelefone());
                    funcionario.setCpf(funcionarioAtualizado.getCpf());
                    return repository.save(funcionario);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Funcionário "+id+" Não cadastrado"));
    }
}
