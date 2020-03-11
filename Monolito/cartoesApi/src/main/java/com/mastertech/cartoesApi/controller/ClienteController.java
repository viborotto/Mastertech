package com.mastertech.cartoesApi.controller;

import com.mastertech.cartoesApi.exception.ResourceNotFoundException;
import com.mastertech.cartoesApi.model.Cartao;
import com.mastertech.cartoesApi.model.Cliente;
import com.mastertech.cartoesApi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    // INSERIR NOVO REGISTRO
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Cliente criarNovoCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //GET
    @GetMapping
    public List<Cliente> listarTodosRegistros() {
        return clienteRepository.findAll();
    }

    //GET ByID
    @GetMapping("/clientes/filter/{id}")
    public Optional<Cliente> buscarPeloId(@PathVariable("id") Long id){
        return clienteRepository.findById(id);
    }

    //GET ByNomeCompleto
    @GetMapping("/clientes/filter/nomeCompleto")
    public List<Cliente> buscarPorNomeCompleto(
            @RequestParam(value = "nomeCompleto") String nome) {
        return clienteRepository.findByNome(nome);
    }

    // Get ByNomeAndCPF
    @GetMapping("/clientes/nomeEcpf")
    public List<Cliente> findByNomeAndCpf(@RequestParam String nome, @RequestParam String cpf){
        return clienteRepository.findByNomeAndCpf(nome,cpf);
    }

    //UPDATE
    @PutMapping("/clientes/{id}")
    public Cliente atualizarRegistroPorId(@PathVariable("id") Long id, @RequestBody Cliente cliente)
            throws ResourceNotFoundException {
        return clienteRepository.findById(id).map(c -> {
            c.setEmail(cliente.getEmail());
            c.setNomeCompleto(cliente.getNomeCompleto());
            c.setCartoes(cliente.getCartoes());
            return clienteRepository.save(c);

        }).orElseThrow(
                () -> new ResourceNotFoundException("Não existe cliente cadastrado com o id: " + id));
    }

    // ATUALIZAR NOME DO REGISTRO PELO ID
    @PatchMapping("/clientes/update/{id}")
    public Optional<Cliente> atualizarNomePeloId(@PathVariable("id") Long id, @RequestParam String nomeCompleto) {
        clienteRepository.updateNomeById(nomeCompleto, id);
        return clienteRepository.findById(id);
    }

    //DELETE
    // APAGAR PELO ID
    @DeleteMapping("/clientes/{id}")
    public void apagarPeloId(@PathVariable("id") Long id) {
        clienteRepository.deleteById(id);
    }

    // APAGAR PELO CPF
    @DeleteMapping("/clientes/delete-by")
    public void apagarPorCpf(
            @RequestParam String nome, @RequestParam Long id) {
        clienteRepository.deleteByIdAndNome(id, nome);
    }



}