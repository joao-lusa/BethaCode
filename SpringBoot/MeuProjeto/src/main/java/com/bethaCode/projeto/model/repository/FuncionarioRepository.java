package com.bethaCode.projeto.model.repository;

import com.bethaCode.projeto.model.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
