package com.bethaCode.projeto.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter@Setter
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Deve ser informado um nome válido")
    @Column(nullable = false, length = 100)
    private String nome;

    @Column
    @Min(value = 1, message = "O valor minimo a ser informado é 1")
    private BigDecimal valor;

    @Column(length = 3)
    private String sigla;

    @Column(length = 3)
    private String jejum;

    @ManyToOne
    @NotNull(message = "Deve ser informado um funcionario para adicionar ou mudar um exame!")
    private Funcionario funcionario;
}
