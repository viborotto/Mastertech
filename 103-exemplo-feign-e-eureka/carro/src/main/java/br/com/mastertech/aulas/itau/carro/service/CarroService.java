package br.com.mastertech.aulas.itau.carro.service;

import br.com.mastertech.aulas.itau.carro.exceptions.CarroNotFoundException;
import br.com.mastertech.aulas.itau.carro.model.Carro;
import br.com.mastertech.aulas.itau.carro.repository.CarroRepository;
import br.com.mastertech.aulas.itau.carro.utils.PlacaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private PlacaUtils placaUtils;

    public Carro create(Carro carro) {
        carro.setPlaca(placaUtils.generatePlaca());

        return carroRepository.save(carro);
    }

    public Carro getByPlaca(String placa) {
        Optional<Carro> carroOptional = carroRepository.findById(placa);

        if(!carroOptional.isPresent()) {
            throw new CarroNotFoundException();
        }

        return carroOptional.get();
    }
}
