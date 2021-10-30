package com.bethaCode.projeto.model.repository;

import com.bethaCode.projeto.model.entity.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExameRepository extends JpaRepository<Exame, Integer> {
    @Query(" select e from Exame e join e.funcionario a where upper(e.nome) like upper(:nome)")
    List<Exame> findByNomeExame(@Param("nome") String nome);
}
