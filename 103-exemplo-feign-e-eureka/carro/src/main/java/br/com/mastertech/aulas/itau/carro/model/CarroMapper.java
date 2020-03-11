package br.com.mastertech.aulas.itau.carro.model;

import br.com.mastertech.aulas.itau.carro.model.dto.request.CreateCarroRequest;
import br.com.mastertech.aulas.itau.carro.model.dto.response.CarroCreatedResponse;
import br.com.mastertech.aulas.itau.carro.model.dto.response.CarroDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public class CarroMapper {

    public Carro toCarro(CreateCarroRequest createCarroRequest) {
        Carro carro = new Carro();

        carro.setModelo(createCarroRequest.getModelo());

        return carro;
    }

    public CarroCreatedResponse toCarroCreatedResponse(Carro carro) {
        CarroCreatedResponse carroCreatedResponse = new CarroCreatedResponse();
        carroCreatedResponse.setModelo(carro.getModelo());
        carroCreatedResponse.setPlaca(carro.getPlaca());
        return carroCreatedResponse;
    }

    public CarroDetailsResponse toCarroDetailsResponse(Carro carro) {
        CarroDetailsResponse carroDetailsResponse = new CarroDetailsResponse();
        carroDetailsResponse.setModelo(carro.getModelo());
        carroDetailsResponse.setPlaca(carro.getPlaca());
        return carroDetailsResponse;
    }


}
