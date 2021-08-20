package br.com.desafio.serasa.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TelefoneDTO implements Serializable {

    private Long idTelefone;
    private Integer ddd;
    private Integer telefone;

}
