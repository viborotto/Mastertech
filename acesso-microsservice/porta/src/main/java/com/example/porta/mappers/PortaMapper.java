package com.example.porta.mappers;


import com.example.porta.dtos.request.CreatePortaRequest;
import com.example.porta.dtos.response.CreatePortaResponse;
import com.example.porta.models.Porta;
import org.springframework.stereotype.Component;

//
@Component
public class PortaMapper {

    //portarequest em porta, porta em response
    public Porta fromCreatePortaRequestToPorta(CreatePortaRequest createPortaRequest) {
        Porta porta = new Porta();

        porta.setAndar(createPortaRequest.getAndar());
        porta.setSala(createPortaRequest.getSala());

        return porta;
    }

    public CreatePortaResponse fromPortaToCreatePortaResponse(Porta porta){
        CreatePortaResponse createPortaResponse = new CreatePortaResponse();

        createPortaResponse.setSala(porta.getSala());
        createPortaResponse.setAndar(porta.getAndar());

        return createPortaResponse;
    }

}
