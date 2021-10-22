package com.bethaCode.projeto.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter@Setter
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Deve ser informado um nome válido")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotNull(message = "Deve ser informado um valor válido")
    @Column(nullable = false)
    private Double valor;

    @Column(length = 3)
    private String sigla;

    @Column(length = 3)
    private String jejum;
}
