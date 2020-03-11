package br.com.mastertech.aula.itau.cartoes.cartao.service;

import br.com.mastertech.aula.itau.cartoes.cartao.exceptions.CartaoNotFoundException;
import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;
import br.com.mastertech.aula.itau.cartoes.cartao.repository.CartaoRepository;
import br.com.mastertech.aula.itau.cartoes.cliente.model.Cliente;
import br.com.mastertech.aula.itau.cartoes.cliente.repository.ClienteRepository;
import br.com.mastertech.aula.itau.cartoes.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private ClienteService clienteService;

    public Cartao create(Cartao cartao) {
        cartao.setAtivo(false);

        Cliente byId = clienteService.getById(cartao.getCliente().getId());
        cartao.setCliente(byId);

        return cartaoRepository.save(cartao);
    }

    public Cartao changeAtivo(String numero, Boolean ativo) {
        Cartao cartao = getByNumero(numero);

        cartao.setAtivo(ativo);

        return cartaoRepository.save(cartao);
    }

    public Cartao getById(Long id) {
        Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }

    public Cartao getByNumero(String numero) {
        Optional<Cartao> cartaoOptional = cartaoRepository.getByNumero(numero);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }
}
