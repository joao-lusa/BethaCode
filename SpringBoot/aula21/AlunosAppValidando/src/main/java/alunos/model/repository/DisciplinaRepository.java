package alunos.model.repository;

import alunos.model.entity.Diciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Diciplina, Integer> {
}
