package com.mastertch.aula.itau.cartao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//passar todo o cartao pra esse projeto

@EnableFeignClients
@SpringBootApplication
public class CartaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartaoApplication.class, args);
	}

}
