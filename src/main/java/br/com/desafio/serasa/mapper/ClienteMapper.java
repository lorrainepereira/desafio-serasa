package br.com.desafio.serasa.mapper;

import br.com.desafio.serasa.dto.ClienteDTO;
import br.com.desafio.serasa.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<ClienteDTO, Cliente>{
}
