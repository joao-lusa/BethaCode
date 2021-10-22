package com.bethaCode.projeto.model.repository;

import com.bethaCode.projeto.model.entity.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamesRepository extends JpaRepository<Exame, Integer> {
}
