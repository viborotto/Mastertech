package br.com.mastertech.aulas.itau.carro.utils;

import org.springframework.stereotype.Component;

@Component
public class PlacaUtils {

    private static final String VALID_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String generatePlaca() {
        String placa = "";

        for (int i = 0; i < 3; i++) {
            placa += VALID_CHARS.charAt((int) (Math.random() * VALID_CHARS.length()));
        }

        placa += "-";

        placa += (int) ((Math.random() * 8999) + 1000);

        return placa;
    }
}
