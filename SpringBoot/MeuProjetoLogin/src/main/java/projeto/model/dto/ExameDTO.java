package projeto.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ExameDTO {
    private String nome;
    private String valor;
    private String sigla;
    private String jejum;
    private Integer idFuncionario;

    public ExameDTO(){

    }
}
