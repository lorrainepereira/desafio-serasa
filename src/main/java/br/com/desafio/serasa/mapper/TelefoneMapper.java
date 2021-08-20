package br.com.desafio.serasa.mapper;

import br.com.desafio.serasa.dto.TelefoneDTO;
import br.com.desafio.serasa.model.Telefone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TelefoneMapper extends EntityMapper<TelefoneDTO, Telefone>{
}
