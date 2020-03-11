package br.com.mastertech.aulas.itau.carro.controller;

import br.com.mastertech.aulas.itau.carro.model.Carro;
import br.com.mastertech.aulas.itau.carro.model.CarroMapper;
import br.com.mastertech.aulas.itau.carro.model.dto.request.CreateCarroRequest;
import br.com.mastertech.aulas.itau.carro.model.dto.response.CarroCreatedResponse;
import br.com.mastertech.aulas.itau.carro.model.dto.response.CarroDetailsResponse;
import br.com.mastertech.aulas.itau.carro.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @Autowired
    private CarroMapper carroMapper;

    @PostMapping
    public CarroCreatedResponse create(@Valid  @RequestBody CreateCarroRequest createCarroRequest) {
        Carro carro = carroMapper.toCarro(createCarroRequest);
        carro = carroService.create(carro);
        return carroMapper.toCarroCreatedResponse(carro);
    }

    @GetMapping("/{placa}")
    public CarroDetailsResponse getByPlaca(@PathVariable String placa) {
        Carro carro = carroService.getByPlaca(placa);
        return carroMapper.toCarroDetailsResponse(carro);
    }
}
