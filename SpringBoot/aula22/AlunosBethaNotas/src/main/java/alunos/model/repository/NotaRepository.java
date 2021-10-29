package alunos.model.repository;

import alunos.model.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Integer> {

    @Query(" select n from Nota n join n.aluno a where upper(a.nome) like upper(:nome) ")
    List<Nota> finByNomeAluno(@Param("nome") String nome);
}
