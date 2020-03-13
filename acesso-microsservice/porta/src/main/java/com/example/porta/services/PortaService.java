package com.example.porta.services;


import com.example.porta.repositories.PortaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//vamos usar os Requests e Response criados aqui
@Service
public class PortaService {

    @Autowired
    private PortaRepository portaRepository;

}
