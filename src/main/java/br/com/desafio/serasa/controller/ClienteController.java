package br.com.desafio.serasa.controller;

import br.com.desafio.serasa.dto.ClienteDTO;
import br.com.desafio.serasa.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@Api(produces = MediaType.APPLICATION_JSON_VALUE, value = "Meals")
public class ClienteController {

    private static final String ID_CLIENTE = "idcliente";
    private static final String BUSCAR_POR_ID ="/{"+ID_CLIENTE+"}";

    @Autowired
    private ClienteService clienteService;

    @ApiOperation(
            value = "Busca por todos os clientes",
            response = ClienteDTO.class,
            responseContainer = "List"
    )
    @GetMapping("/")
    public ResponseEntity findAll() {
        List<ClienteDTO> lista = clienteService.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @ApiOperation(
            value = "Cadastrar um cliente",
            response = ClienteDTO.class
    )
    @PostMapping
    public ClienteDTO cadastrar(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.salvar(clienteDTO);
    }

    @ApiOperation(
            value = "Busca por id do cliente",
            response = ClienteDTO.class
    )
    @GetMapping(BUSCAR_POR_ID)
    public ClienteDTO findAll(
            @ApiParam(name = ID_CLIENTE, value = "id do cliente", readOnly = true)
            @RequestParam(name = ID_CLIENTE)
            Long idCliente
    ) {
        return clienteService.buscarPorID(idCliente);
    }
}
