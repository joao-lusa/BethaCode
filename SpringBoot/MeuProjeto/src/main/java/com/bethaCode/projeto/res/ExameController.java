package com.bethaCode.projeto.res;

import com.bethaCode.projeto.model.dto.ExameDTO;
import com.bethaCode.projeto.model.entity.Exame;
import com.bethaCode.projeto.model.entity.Funcionario;
import com.bethaCode.projeto.model.repository.ExameRepository;
import com.bethaCode.projeto.model.repository.FuncionarioRepository;
import com.bethaCode.projeto.model.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/exames")
@RequiredArgsConstructor
public class ExameController {

    private final ExameRepository exameRepository;
    private final FuncionarioRepository funcionarioRepository;
    private final BigDecimalConverter bigDecimalConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Exame salvar(@RequestBody ExameDTO exameDTO){

        BigDecimal valorDoExame = bigDecimalConverter.converter(exameDTO.getValor());

       Integer idFuncionario = exameDTO.getIdFuncionario();
       Funcionario funcionario = funcionarioRepository
                   .findById(idFuncionario)
                   .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                           "O funcionario "+idFuncionario+" não existe em nossa aplicação!"));

       Exame exame = new Exame();
       exame.setNome(exameDTO.getNome());
       exame.setJejum(exameDTO.getJejum());
       exame.setSigla(exameDTO.getSigla());
       exame.setFuncionario(funcionario);
       exame.setValor(valorDoExame);

       return exameRepository.save(exame);
    }

    @GetMapping("{id}")
    public Exame acharPorId(@PathVariable Integer id){
        return exameRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Exame "+id+ "não cadastrado!"));
    }

    @GetMapping
    public List<Exame> pesquisar(
            @RequestParam(value = "nome", required = false, defaultValue = "") String nomeDoExame){
        return exameRepository.findByNomeExame("%"+nomeDoExame+"%");
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        exameRepository
                .findById(id)
                .map(exame -> {
                    exameRepository.delete(exame);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Exame "+id+" não cadastrado"));
    }

    @PutMapping("{id}")
    public void atulizar(@PathVariable Integer id, @RequestBody ExameDTO dadoAtulizado){

        BigDecimal valorDoExame = bigDecimalConverter.converter(dadoAtulizado.getValor());
        Integer idFuncionario = dadoAtulizado.getIdFuncionario();
        Funcionario funcionario = funcionarioRepository
                .findById(idFuncionario)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "O funcionario "+idFuncionario+" não existe em nossa aplicação!"));

        exameRepository
                    .findById(id)
                    .map(exame -> {
                        exame.setFuncionario(funcionario);
                        exame.setValor(valorDoExame);
                        exame.setSigla(dadoAtulizado.getSigla());
                        exame.setJejum(dadoAtulizado.getJejum());
                        exame.setNome(dadoAtulizado.getNome());
                        return exameRepository.save(exame);
                    })
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "O Exame "+id+" não foi cadastrado"));
    }
}
