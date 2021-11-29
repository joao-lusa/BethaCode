package com.bethaCode.projeto.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter@Setter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "Deve ser informado um nome válido!")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotEmpty(message = "Deve ser informado um email válido!")
    @Column(nullable = false, length = 100)
    private String email;

    @Column(length = 100)
    private String cidade;

    @NotEmpty(message = "Deve Ser informado um numero de telefone")
    @Column(nullable = false,length = 100)
    private String telefone;

    @NotEmpty(message = "Deve Ser informado um cpf válido")
    @Column(nullable = false, length = 100)
    private String cpf;


}
