package com.mastertch.aula.itau.cliente.cliente;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule iRule(){
        return  new WeightedResponseTimeRule();
    }

//    @Bean
//    public IPing menorPing(){
//        return new
//    }
}
