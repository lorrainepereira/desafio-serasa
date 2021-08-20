package br.com.desafio.serasa.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class ClienteDTO implements Serializable {

    private Long idCliente;
    private String nome;
    private LocalDate dataNascimento;
    private TelefoneDTO telefone;
}
