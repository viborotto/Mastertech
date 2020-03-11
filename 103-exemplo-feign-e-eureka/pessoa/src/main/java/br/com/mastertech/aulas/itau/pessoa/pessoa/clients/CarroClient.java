package br.com.mastertech.aulas.itau.pessoa.pessoa.clients;

import br.com.mastertech.aulas.itau.pessoa.pessoa.clients.dto.CarroDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "carro")
public interface CarroClient {

    @GetMapping("/carro/{placa}")
    CarroDTO getCarroByPlaca(@PathVariable String placa);

}
