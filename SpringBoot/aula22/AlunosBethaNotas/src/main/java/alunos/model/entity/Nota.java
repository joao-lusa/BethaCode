package alunos.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter@Setter
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @NotNull(message = "Deve ser informado o Aluno para idicar a nota!")
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @NotNull(message = "Deve ser informada a Diciplina para indicar a nota!")
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @Column(name = "data_nota")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNota;

    @Column
    @Min(value = 1, message = "Menor nota permitida é 1!")
    private BigDecimal nota;
}
