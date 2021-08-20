package br.com.desafio.serasa.service;

import br.com.desafio.serasa.dto.ClienteDTO;
import br.com.desafio.serasa.mapper.ClienteMapper;
import br.com.desafio.serasa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDTO salvar(ClienteDTO clienteDTO){
        return clienteMapper.toDto(clienteRepository.save(clienteMapper.toEntity(clienteDTO)));
    }

    public ClienteDTO buscarPorID(Long id){
        return clienteMapper.toDto(clienteRepository.findById(id).orElse(null));
    }

    public List<ClienteDTO> findAll() {
        return clienteMapper.toDto(clienteRepository.findAll());
    }

}
