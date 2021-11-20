package projeto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.model.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
