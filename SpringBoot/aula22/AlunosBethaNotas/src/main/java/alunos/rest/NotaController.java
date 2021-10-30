package alunos.rest;

import alunos.model.dto.NotaDTO;
import alunos.model.entity.Aluno;
import alunos.model.entity.Disciplina;
import alunos.model.entity.Nota;
import alunos.model.repository.AlunoRepository;
import alunos.model.repository.DisciplinaRepository;
import alunos.model.repository.NotaRepository;
import alunos.model.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
@RequiredArgsConstructor
public class NotaController {

    private final NotaRepository notaRepository;
    private final AlunoRepository alunoRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final BigDecimalConverter bigDecimalConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Nota salvar(@RequestBody NotaDTO notaDTO){
        LocalDate dataNota = LocalDate.parse(notaDTO.getDataNota(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        BigDecimal valorDaNota = bigDecimalConverter.converter(notaDTO.getNota());

        Integer idAluno = notaDTO.getIdAluno();
        Aluno aluno = alunoRepository
                    .findById(idAluno)
                    .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "O aluno " + idAluno + " Não existe em nossa aplicação!"));

        Integer idDisciplina = notaDTO.getIdDisciplina();
        Disciplina disciplina = disciplinaRepository
                    .findById(idDisciplina)
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "A Disciplina "+idDisciplina+" não existe em nossa aplicação!"));

        Nota nota = new Nota();
        nota.setDataNota(dataNota);
        nota.setAluno(aluno);
        nota.setDisciplina(disciplina);
        nota.setNota(valorDaNota);

        return notaRepository.save(nota);
    }

    @GetMapping("{id}")
    public Nota acharPorId(@PathVariable Integer id){
        return notaRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Nota "+id+" não encontrada!"));
    }

    @GetMapping
    public List<Nota> pesquisar(
            @RequestParam(value = "nome", required = false, defaultValue = "") String nomeDoAluno){
        return notaRepository.finByNomeAluno("%"+nomeDoAluno+"%");
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Integer id){
        notaRepository
                .findById(id)
                .map(nota -> {
                    notaRepository.delete(nota);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Nota "+id+" não cadastrada"));
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody NotaDTO dadoAtualizado){

        LocalDate dataNota = LocalDate.parse(dadoAtualizado.getDataNota(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Integer idAluno = dadoAtualizado.getIdAluno();
        Aluno aluno = alunoRepository
                    .findById(idAluno)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "O aluno"+idAluno+" não existe em nossa aplicação"));

        Integer idDisciplina = dadoAtualizado.getIdDisciplina();
        Disciplina disciplina = disciplinaRepository
                .findById(idDisciplina)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "A disciplina "+idDisciplina+" não existe em nossa aplicação!"));

        notaRepository
                .findById(id)
                .map(nota -> {
                    nota.setDataNota(dataNota);
                    nota.setNota(bigDecimalConverter.converter(dadoAtualizado.getNota()));
                    nota.setDisciplina(disciplina);
                    nota.setAluno(aluno);
                    return notaRepository.save(nota);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Nota "+id+" não cadastrada"));
    }
}